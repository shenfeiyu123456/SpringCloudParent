package com.zzcedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Evan
 * @Date: 2020/12/1 15:42
 */
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@SpringBootApplication
public class DeptProvider8001_App

{

    public static void main(String[] args)

    {

        SpringApplication.run(DeptProvider8001_App.class, args);

    }

}

