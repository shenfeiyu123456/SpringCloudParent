package com.zzcedu.controller;

import com.zzcedu.entity.Dept;
import com.zzcedu.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Evan
 * @Date: 2020/12/3 14:28
 */
@RestController

public class DeptController_Feign

{

    @Autowired

    private DeptClientService service = null;

    @RequestMapping(value = "/consumer/dept/get/{id}")

    public Dept get(@PathVariable("id") Long id)

    {

        return this.service.get(id);

    }

    @RequestMapping(value = "/consumer/dept/list")

    public List<Dept> list()

    {

        return this.service.list();

    }

    @RequestMapping(value = "/consumer/dept/add")

    public Object add(Dept dept)

    {

        return this.service.add(dept);

    }

}

