package com.hiersun.service;

import java.util.List;

import com.hiersun.entity.Department;

public interface DepartmentService {

	/**
	 * 模糊查询部门信息
	 * 
	 * @param name
	 * @return
	 */
	public List<Department> findByName(String name);

}
