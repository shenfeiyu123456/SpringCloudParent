package com.zzcedu;

import com.zzcedu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: Evan
 * @Date: 2020/12/1 16:02
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="SPRINGCLOUD-DEPT",configuration= MySelfRule.class)
public class DeptConsumer80_App

{

    public static void main(String[] args)

    {

        SpringApplication.run(DeptConsumer80_App.class, args);

    }

}





