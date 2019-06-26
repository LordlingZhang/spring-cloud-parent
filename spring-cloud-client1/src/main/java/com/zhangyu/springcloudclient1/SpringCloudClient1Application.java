package com.zhangyu.springcloudclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClient1Application.class, args);
    }

}
