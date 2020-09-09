**16**、****Spring **框架中有哪些不同类型的事件？**

(1)       上下文更新事件

(2)       上下文开始事件

(3)       上下文停止事件

(4)       上下文关闭事件

(5)       请求处理事件

如果一个bean实现了ApplicationListener接口，当有个ApplicationEvent被发布以后，bean会自动被通知。

 

**17**、解释一下 **Spring AOP** **里面的几个名词**

（1）切面（Aspect）:被抽取的公共模块，可能会横切多个对象

（2）连接点：指方法，在springaop中，一个连接点代表一个方法

（3）通知：在切面的某个特定的连接点上执行操作

（4）引入：内部类型声明，声明额外的方法或者某个类型的字段

（5）目标对象：被一个或者多个切面锁通知的对象

（6）切入点：指我们要对那些joinpoint进行拦截定义

（7）织入：指把增强应用到目标对象来创建新的代理对象过程

**18**、****Spring** **通知有哪些类型？**

（1）前置通知

（2）返回后通知

（3）抛出异常后通知

（4）后通知

（5）环绕通知

**18**、****Spring** **通知有哪些类型？**

1)        单例模式：spring文件设置bean默认单例

2)        类代理：没有实现任何接口

3)        模板方式模式：解决代码问题

4)        前端控制器

5)        试图帮助

6)        依赖注入

7)        工厂模式

8)        指向新创建的对象、

 

**1**、什么是** **Spring MVC** **？简单介绍下你对** **springMVC** 

**的理解****?** 

SpringMvc是基于java的实现MVC设计模式的请求驱动类的轻量级web框架，吧model，view，controller分离，将web层进行职责解耦。

**2**、****SpringMVC** **的流程？** 

(1)       用户发送请求治前端控制器DispathcherServlet

(2)       前端控制器收到请求，调用HandleMapping，请求获取

(3)       处理器引射器根据请求Url找到具体处理器

(4)       前端控制器调用handlerAdapter处理器适配器

(5)       handlerAdapter经过调用具体处理器

(6)       Handler执行完全返回modelAndView

(7)       handlerAdapter将Handler执行结果modelAndView返回给前端控制器

(8)       前端控制器将modelAndView传给ViewResolve视图解析器进行解析

(9)       ViewResolve解析返回具体view

(10)   前端控制器对view进行喧染视图

(11)   前端控制器响应用户

**3**、****Springmvc** **的优点**

1）可以支持各种视图技术，不局限域jsp

2）与spring框架集成

3）清晰的角色分配

4）支持各种请求资源的映射策略

**4**、****Spring MVC** **的主要组件**

1)        前端控制器DispathcherServlet

2)        处理器映射器HandleMapping

3)        处理器适配器handlerAdapter

4)        处理器Handler

5)        视图解析器ViewResolve

6)        视图view

**5**、****SpringMVC** **怎么样设定重定向和转发的？**

转发：再返回值前面加“forward”

重定向：在返回值前面加“redirect”

**6**、****SpringMvc** **怎么和** **AJAX** **相互调用的？** 

通过Jackson框架就可以吧java里的对象转化成js可以识别json对象

（1）加入jackson.jar

（2）在配置文件中配置json映射

（3）在接受ajax方法里面直接返回object，list等，但方法前面加入@ResponseBod      注解