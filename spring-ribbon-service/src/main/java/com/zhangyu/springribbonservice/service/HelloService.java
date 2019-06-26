package com.zhangyu.springribbonservice.service;

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
    public String getHelloContent() {
        return restTemplate.getForObject("http://SERVICE-HELLOWORLD/home",String.class);
    }
}
