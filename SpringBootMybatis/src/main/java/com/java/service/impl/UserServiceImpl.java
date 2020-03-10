package com.java.service.impl;


import com.java.entity.User;
import com.java.entity.UserExample;
import com.java.mapper.UserMapper;
import com.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lijiawang_1 on 2019/4/8.
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectUser(){
        UserExample userExample = new UserExample();

        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdIsNotNull();
        return userMapper.selectByExample(userExample);
    }
}
