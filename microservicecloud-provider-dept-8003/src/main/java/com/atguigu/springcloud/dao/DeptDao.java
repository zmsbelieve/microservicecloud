package com.atguigu.springcloud.dao;

import com.atguigu.entities.Dept;

import java.util.List;

public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
