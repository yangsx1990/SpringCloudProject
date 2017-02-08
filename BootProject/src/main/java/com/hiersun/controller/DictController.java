package com.hiersun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hiersun.service.DictService;
/**
 * 字典Controller
 * @author yangsaixing
 *
 */
@Controller
@RequestMapping("dict")
public class DictController {

	@Autowired DictService dictService;
	/**
	 * 根据字典id查询信息
	 * @param pid 字典id
	 * @return
	 */
	@RequestMapping(value = "/getDictByPid/{pid}")
	public ResponseEntity<Object> getDictByPid(int pid) {
		try {
			return new ResponseEntity<Object>(dictService.getDictByPid(pid), HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/getDictSelectItem/{id}")
	public ResponseEntity<Object> getDictSelectItem(@PathVariable int id) {
		try {
			return new ResponseEntity<Object>(dictService.getDicts(id), HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
