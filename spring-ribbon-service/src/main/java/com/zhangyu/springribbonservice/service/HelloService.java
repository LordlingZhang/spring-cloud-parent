package com.zhangyu.springribbonservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangyu
 * @description
 * @date 2019/6/26
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 调用服务（注意加上访问地址）
     * @return
     */
    @HystrixCommand(fallbackMethod = "serviceFailure")
    public String getHelloContent() {
        return restTemplate.getForObject("http://SERVICE-HELLOWORLD/home",String.class);
    }

    /**
     * 设置熔断open之后调用的方法
     * 方法返回类型必须和设置熔断的方法类型一致
     * @return
     */
    public String serviceFailure(){
        return "this service shutdown!!!!!!!";
    }
}
