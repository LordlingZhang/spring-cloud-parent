package com.zhangyu.springcloudclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @description
 * @date 2019/6/25
 */
@RestController
public class HomeController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/home")
    public String home() {
        return "hello world from port " + port;
    }
}
