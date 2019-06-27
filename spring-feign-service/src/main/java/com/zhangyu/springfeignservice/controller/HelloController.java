package com.zhangyu.springfeignservice.controller;

import com.zhangyu.springfeignservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @description
 * @date 2019/6/26
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/say")
    public String say(){
        return helloService.sayHello();
    }
}
