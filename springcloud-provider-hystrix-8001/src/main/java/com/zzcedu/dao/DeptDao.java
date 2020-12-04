package com.zzcedu.dao;

import com.zzcedu.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Evan
 * @Date: 2020/12/1 15:33
 */
@Mapper

public interface DeptDao

{

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}

