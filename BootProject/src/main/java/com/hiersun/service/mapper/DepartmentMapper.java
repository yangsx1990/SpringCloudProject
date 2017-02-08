package com.hiersun.service.mapper;

import java.util.List;

import tk.mybatis.mapper.common.Mapper;

import com.hiersun.entity.Department;

public interface DepartmentMapper extends Mapper<Department> {

	public List<Department> selectByName(String name);
}