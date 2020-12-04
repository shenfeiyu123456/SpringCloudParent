package com.zzcedu.service;


import com.zzcedu.dao.DeptDao;
import com.zzcedu.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Evan
 * @Date: 2020/12/1 15:39
 */
@Service

public class DeptServiceImpl implements DeptService

{

    @Autowired

    private DeptDao dao ;



    @Override

    public boolean add(Dept dept)

    {

        return dao.addDept(dept);

    }

    @Override

    public Dept get(Long id)

    {

        return dao.findById(id);

    }

    @Override

    public List<Dept> list()

    {

        return dao.findAll();

    }

}

