package com.zhangyu.springfeignservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangyu
 * @description
 * @date 2019/6/26
 */
@FeignClient(value = "SERVICE-HELLOWORLD")
public interface HelloService {


    /**
     * 调用服务（注意加上访问地址）
     * @return
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    String sayHello();
}
