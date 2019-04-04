##委派模式
##委派模式的定义及应用场景
委派模式（delegate）：并不属于23种设计模式，但是面向对象常用的一种设计模式，而且在SpringMVC源码中有大量使用。这种模式原理就是类 B和类 A 是两个互相没有任何关系的类，B 具有和 A 一模一样的方法和属性;并且调用 B 中的方法，属性就是调用 A 中同名的方法和属性。B 好像就是一个受 A 授权委托的中介。第三方的代码不需要知道 A 的 存在，也不需要和 A 发生直接的联系，通过 B 就可以直接使用 A 的功能，这样既能够使用到 A 的各种功能，又能够很好的将 A 保护起来了，一举两得。也是一种行为型的设计模式。
举一个生活化的例子，例如公司中三个层级员工，执行员工staff，项目经理manager，老板boss，老板将相对应的任务和目标和项目经理沟通，他并不关心执行员工staff执行的情况，只需要从manager这里了解项目进展和结果，项目经理manager将具体项目拆解或者分配给相对应的员工去执行，这种情况就类似一种委派模式。


####具体过程
1、创建IEmployee接口
2、创建员工类IEmployeeA类
3、创建员工类IEmployeeB类
4、创建项目经理Leader类
5、创建Boss类下达命令

##委派模式在源码中的体现
下面我们来还原一下SpringMVC的DispatcherServlet是如何实现委派模式的，
DispatcherServlet的委托流程：
            用户发送请求——>DispatcherServlet，前端控制器收到请求后自己不进行处理，而是委托给其他的解析器进行处理，作为统一访问点，进行全局的流程控制。
            DispatcherServlet——>HandlerMapping，映射处理器将会把请求映射为HandlerExecutionChain对象（包含一个Handler处理器（页面控制器）对象、多个HandlerInterceptor拦截器）对象。
            DispatcherServlet——>HandlerAdapter，处理器适配器将会把处理器包装为适配器，从而支持多种类型的处理器，即适配器设计模式的应用，从而很容易支持很多类型的处理器。
            DispatcherServlet——> ViewResolver， 视图解析器将把ModelAndView对象（包含模型数据、逻辑视图名）解析为具体的View。
            DispatcherServlet——>View，View会根据传进来的Model模型数据进行渲染，此处的Model实际是一个Map数据结构。
            返回控制权给DispatcherServlet，由DispatcherServlet返回响应给用户，到此一个流程结束。
参考图片地址是https://img-blog.csdnimg.cn/20181115220504527.png
