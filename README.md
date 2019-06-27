## 学习spring-cloud

#### 包含以下模块
- spring-cloud-server 服务端
- spring-cloud-client 客户端
- spring-cloud-config-server 配置服务端
- spring-cloud-config-client 配置客户端
- spring-cloud-client 客户端
- spring-cloud-client1 客户端
- spring-ribbon-service 负载均衡ribbon服务
- spring-feign-service 负载均衡feign服务
- spring-turbin-service 熔断、负载监控页面
- spring-zuul-service 路由及过滤模块

**启动顺序从上到下**

#### 访问页面
- 刷新config-server(POST)
> http://localhost:8881/refresh
- 通过rabbitmq刷新config-server(POST)
> http://localhost:8881//bus/refresh

- ribbon/feign的熔断监控页面
> http://localhost:8901/hystrix
- 监控详情填充
> http://localhost:8901/hystrix.stream
- 同时监控多个接口
> http://localhost:8903/hystrix

> 填充 http://localhost:8903/turbine.stream
