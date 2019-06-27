package com.zhangyu.springfeignservice.service;

import org.springframework.stereotype.Service;

/**
 * @author zhangyu
 * @description 熔断open后实现类
 * @date 2019/6/27
 */
@Service
public class HelloServiceFailureImpl implements HelloService{
    /**
     * 调用服务（注意加上访问地址）
     *
     * @return
     */
    @Override
    public String sayHello() {
        return "feign熔断open！！！！";
    }
}
