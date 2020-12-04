package com.zzcedu.service;

import com.zzcedu.entity.Dept;

import java.util.List;

/**
 * @Author: Evan
 * @Date: 2020/12/1 15:38
 */
public interface DeptService

{

    public boolean add(Dept dept);

    public Dept    get(Long id);

    public List<Dept> list();

}

