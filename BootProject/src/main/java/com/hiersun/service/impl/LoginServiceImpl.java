package com.hiersun.service.impl;

import com.hiersun.entity.User;
import com.hiersun.service.LoginService;
import com.hiersun.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 登录服务实现类
 * Author: liubaocheng
 * Create: 2017-01-03 10:48
 **/
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;


    public  User selectByName(User user){
        return userMapper.selectOne(user);
    }
}
