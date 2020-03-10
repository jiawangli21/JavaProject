package com.java.controller;


import com.java.entity.User;
import com.java.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lijiawang_1 on 2019/4/8.
 *
 * spring boot 跳转页面必须是RestController注解，Controller注解会报找不到页面错误
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    /**
     *  添加用户
     * @return
     */

    @RequestMapping("/selectUser")
    public List<User> selectUser(Model model){
        List<User> list = userService.selectUser();

        return list;
    }

}
