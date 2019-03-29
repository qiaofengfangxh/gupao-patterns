##委派模式
##委派模式的定义及应用场景
委派模式不属于23种设计模式中，委派模式的基本作用就是负责任务的调度和分配任务，跟代理模式模式很像，可以看做是一种特殊情况下的静态
的全权代理，但是代理模式注重的是过程，而委派模式注重的是结果。委派模式在Spring中应用的非常多，大家常用的DispatcherServlet
其实就是用到了委派模式。显示生活中也常有委派的场景发生，例如：老板给项目经理下达任务，项目经理会根据实际情况给每个员工派发工作
任务，待员工把工作任务完成之后，再由项目经理汇报工作进度和结果。

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
