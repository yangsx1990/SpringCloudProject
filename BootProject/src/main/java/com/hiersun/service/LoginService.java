package com.hiersun.service;


import com.hiersun.entity.User;

/**
 * Description: 登录服务
 * Author: liubaocheng
 * Create: 2017-01-03 10:48
 **/
public interface LoginService {

     User selectByName(User user);
}
