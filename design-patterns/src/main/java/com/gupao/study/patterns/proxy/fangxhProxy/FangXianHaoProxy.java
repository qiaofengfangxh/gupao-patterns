package com.gupao.study.patterns.proxy.fangxhProxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class FangXianHaoProxy {

    private final static String ln = "\r\n";

    public static Object newInstance(FangXianHaoClassLoader fangXianHaoClassLoader,
                                     Class<?>[] interfaces,
                                     FangXianHaoInvocationHandler invocationHandler) {
        try {
            String src = generateCodeStr(interfaces);
            System.out.println(src);
            //把生成的字节码输出到文件
            String filePath = FangXianHaoProxy.class.getResource("").getPath();
            System.out.println(filePath);
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();
            //把生成的.java 文件编译成class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manage.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manage, null, null, null, iterable);
            task.call();
            //4、编译生成的.class 文件加载到 JVM 中来
            Class proxyClass = fangXianHaoClassLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(FangXianHaoInvocationHandler.class);
            //f.delete();
            //5、返回字节码重组以后的新的代理对象
            return c.newInstance(invocationHandler);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * @param
     * @return 返回生成的代理类的源码
     * @Description 生成代理类的方法
     * @author YangQiang
     * @date 2019/3/18 22:34
     */
    private static String generateCodeStr(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        //包名
        sb.append("package com.gupao.study.patterns.proxy.fangxhProxy;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        //实现接口
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        //持有InvovationHandler的引用
        sb.append("FangXianHaoInvocationHandler h;" + ln);
        //通过构造函数进行注入
        sb.append("public $Proxy0(FangXianHaoInvocationHandler h) { " + ln);
        sb.append("this.h = h;");
        sb.append("}" + ln);
        //循环遍历接口中的方法，实现接口中的方法
        for (Method m : interfaces[0].getMethods()) {
            Class[] paramTypes = m.getParameterTypes();
            //组装接口中的形参数
            String params = "";
            //组装通过反射获取接口中方法的参数数组
            String paraArry = "null";
            String a = "";
            String b = "";
            //组装invocation方法中的args
            String args = "null";
            for (int i = 0; i < paramTypes.length; i++) {
                params += paramTypes[i].getName() + " p" + i;
                if (i != paramTypes.length - 1) {
                    a = a + paramTypes[i].getName() + ".class ,";
                    b = b + " p" + i + ",";
                    params += ",";
                } else {
                    a = a + paramTypes[i].getName() + ".class ";
                    b = b + " p" + i;
                }
            }
            if (!"".equals(a)) {
                a = "new Class[]{" + a + "}";
                paraArry = a;
            }
            if (!"".equals(b)) {
                args = "new Object[]{" + b + "}";
            }

            //这里需要将讲接口中的参数进行获取
            //params = params.substring(0,params.length()-1);
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(" + params + ") {" + ln);
            sb.append("try{" + ln);
            //通过接口动态的拿到方法

            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\""
                    + m.getName() + "\"," + paraArry + ");" + ln);
            //在代理类中调用的是incationHandler中的invoke方法，并将代理类和方法名称以及参数传入；
            sb.append("return (" + m.getReturnType().getName() + ")" + ln);
            sb.append("this.h.invoke(this,m," + args + ");" + ln);
            //这里需要将接口的返回值返回回去，上面可以强转
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}");
            if (!m.getReturnType().isPrimitive()) {
                sb.append("return null;");
            } else {
                sb.append("return true;");
            }
            sb.append("}");
        }
        sb.append("}" + ln);
        return sb.toString();


    }

}


