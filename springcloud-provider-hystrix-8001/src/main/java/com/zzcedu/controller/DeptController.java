package com.zzcedu.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zzcedu.entity.Dept;
import com.zzcedu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Evan
 * @Date: 2020/12/1 15:40
 */
@RestController

public class DeptController

{

    @Autowired

    private DeptService service = null;



    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)

    @HystrixCommand(fallbackMethod = "processHystrix_Get")

    public Dept get(@PathVariable("id") Long id)

    {

        Dept dept =  this.service.get(id);

        if(null == dept)

        {

            throw new RuntimeException("该ID："+id+"没有没有对应的信息");

        }

        return dept;

    }



    public Dept processHystrix_Get(@PathVariable("id") Long id)

    {

        return new Dept().setDeptno(id)

                .setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")

                .setDb_source("no this database in MySQL");

    }

}

