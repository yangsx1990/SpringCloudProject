package com.hiersun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hiersun.service.LoginService;

/**
 * Description: 系统默认页
 * Author: liubaocheng
 * Create: 2017-01-03 10:48
 **/
@RestController
public class IndexController {

	@Autowired 
	private LoginService loginService;

	@RequestMapping(value = "/left", method = RequestMethod.GET)
	public ModelAndView left() {
		// 菜单处理
		ModelAndView view = new ModelAndView("/pages/left");
		return view;
	}

	@RequestMapping(value = "/top", method = RequestMethod.GET)
	public ModelAndView top() {
		// 菜单处理
		ModelAndView view = new ModelAndView("/pages/top");
		return view;
	}

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public ModelAndView main() {
		// 菜单处理
		ModelAndView view = new ModelAndView("/pages/index");
		return view;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() {
		// 菜单处理
		ModelAndView view = new ModelAndView("/index");
		return view;
	}

	//	@RequestMapping(value = "/login", method = RequestMethod.GET)
	//	public ModelAndView login() {
	//		// 菜单处理
	//		ModelAndView view = new ModelAndView("/login");
	//		return view;
	//	}

}
