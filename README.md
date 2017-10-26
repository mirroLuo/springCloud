#SpringCloud Demo  

基于**springCloud**框架，搭建的简单demo。  

###包含组件：  
 * **注册中心**（`Eureka Netflix`）
 * **网关**（`Zuul Netflix`）
 * **通信**（`Ribbon Netflix`，`Feign OpenFeign`）
 * **配置中心**（`Spring Cloud Config`）
 * **熔断器**（`Hystrix Netflix`）

##项目列表
  * **eureka-server**（注册中心）
  * **api-gateway**（网关）
  * **sys-service**（系统管理服务）
  * **business-service**（业务服务）
  * **config-server**（配置中心）
  * **config**（配置文件）  
  
##开发环境  

**Java8**、**springBoot**、**Maven**、**Redis**、**Mysql**  

##TO DO LIST
  * 网关集成`springSecurity`、`Oauth2`
  * 引入组件`Spring Cloud Task`
  * 集成`redis`
  * 集成消息队列`MQ`
