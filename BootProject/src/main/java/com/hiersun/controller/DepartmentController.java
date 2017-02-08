package com.hiersun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hiersun.service.DepartmentService;
/**
 * 部门管理Controller
 * @author yangsaixing
 *
 */
@Controller
@RequestMapping("depart")
public class DepartmentController {
	@Autowired DepartmentService departmentService;

	/**
	 * 模糊查询部门信息
	 * @param name 查询内容
	 * @return
	 */
	@RequestMapping(value = "/getDepart/")
	public ResponseEntity<Object> getDepartByName(String name) {
		try {
			return new ResponseEntity<Object>(departmentService.findByName(name), HttpStatus.OK);
		}
		catch (Exception e) {
			System.out.println(e.toString());
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
