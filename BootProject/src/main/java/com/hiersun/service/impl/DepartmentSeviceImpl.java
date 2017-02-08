package com.hiersun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiersun.entity.Department;
import com.hiersun.service.DepartmentService;
import com.hiersun.service.mapper.DepartmentMapper;

@Service
public class DepartmentSeviceImpl implements DepartmentService {

	@Autowired DepartmentMapper departmentMapper;

	@Override
	public List<Department> findByName(String name) {
		List<Department> departments = departmentMapper.selectByName(name);
		for (Department department : departments) {
			int departid = department.getDepartmentId();
			department.setFullName(getDepartmentFullName(departid, ""));
		}
		return departments;
	}

	/**
	 * 获取所有上级部门的名称
	 * 
	 * @param departmentId
	 * @return
	 */
	private String getDepartmentFullName(int departmentId, String fullName) {
		Department department = departmentMapper.selectByPrimaryKey(departmentId);
		if (null != department) {
			if (null == fullName || fullName == "") {
				fullName = department.getDepartmentName();
			}
			else
				fullName = department.getDepartmentName() + ">>" + fullName;
			fullName = getDepartmentFullName(department.getParentDepartmentId(), fullName);
		}
		return fullName;
	}
}
