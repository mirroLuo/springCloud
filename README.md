#SpringCloud Demo  

基于**springCloud**框架，搭建的简单demo。包含组件：**注册中心**（`Eureka Netflix`）、**网关**（`Zuul Netflix`）、  
**通信**（`Ribbon Netflix`，`Feign OpenFeign`）、**配置中心**（`Spring Cloud Config`）、**熔断器**（`Hystrix Netflix`）。  

##项目列表
  * **eureka-server**（注册中心）
  * **eureka-client-1**（服务注册1）
  * **eureka-client-2**（服务注册2）
  * **service-zuul**（网关）
  * **service-ribbon**（服务通信，ribbon方式）
  * **service-feign**（服务通信，feign方式）
  * **config-server**（配置中心）
  * **config-client**（配置消费服务demo）
  * **config**（配置文件）  
  
##开发环境  

**Java8**、**springBoot**、**Maven**  

##TO DO LIST
  * 网关集成`springSecurity`/`shiro`
  * 引入组件`Spring Cloud Task`
  * 集成`redis`
  * 集成消息队列`rocket MQ`
