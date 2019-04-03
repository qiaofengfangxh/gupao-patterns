package com.gupao.study.patterns.proxy.fangxhProxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FangXianHaoClassLoader extends ClassLoader {

    private File classPathFile;

    public FangXianHaoClassLoader() {
        //获取当前类所在的路径
        String classPath = FangXianHaoClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //获取当前类所在的包名+传入进来的类名，用来查找类的
        String className = FangXianHaoClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
            //类所在的文件路径，将.替换成/
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            if (classFile.exists()) {
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    //从文件读入数据，并将数据写入byteOutButStream中
                    while ((len = in.read(buff)) != -1) {
                        //边读边写，有可能数据存不下
                        out.write(buff, 0, len);
                    }
                    return defineClass(className, out.toByteArray(), 0, out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (null != in) {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (out != null) {
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }

}
