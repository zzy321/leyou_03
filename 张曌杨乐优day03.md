今天我们学习了乐优的后台展示和前后台交互：跨域



​        1：在leyou-item-interface中添加category实体类，然后在pom文件中加入大纲里的依赖

​	2：找到leyou-item-service中创建一个controller，然后在里面写咱们的controller代码，注	 意加getMapping（）注解；

​	3：在创建一个service，然后在写咱们的service层代码；

​	4：在创建一个mapper,然后继承Mapper<Category>接口，里面只要有三个注解：

​		@SpringBootApplication，@EnableDiscoveryClient，@MapperScan(对mapper接口包扫描)



跨域：

​	在leyou-gateway中编写一个配置类(注解：@Configuration),注册CorsFilter；

​	主要有这几步：

​		1：添加CORS配置信息

​			（1）允许的域，不能写*，不然cookie不能使用

​			（2）是否发送cookie信息

​			（3）允许请求的方式

​			（4）允许头信息

​		2：添加映射路径，拦截一切请求

​		3：返回新的CorsFileter

​		4：然后运行项目会看见分类管理里面的一些数据