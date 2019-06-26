package com.zhangyu.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @description
 * @date 2019/6/26
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${hello}")
    String hello;
    @RequestMapping(value = "/hello")
    public String hello(){
        return hello;
    }
}
