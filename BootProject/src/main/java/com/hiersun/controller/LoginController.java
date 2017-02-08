package com.hiersun.controller;

import com.hiersun.entity.User;
import com.hiersun.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description: 登录控制器
 * Author: liubaocheng
 * Create: 2017-01-03 10:48
 **/
@Controller
@RequestMapping
public class LoginController {


    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        // 菜单处理
        ModelAndView view = new ModelAndView("redirect:login");
        return view;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user,Model model){
        user = loginService.selectByName(user);

        if(user!=null){
            return "index";
        }
        model.addAttribute("msg","用户名密码错误");
        return "login";
    }
}
