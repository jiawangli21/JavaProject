package com.java.controller;

import com.java.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lijiawang_1 on 2019/4/14.
 */
@Controller
public class RedriectController {

    @RequestMapping("/welcome")
    public String welcomePage(){
        return "index";
    }


    @RequestMapping("/insertUser")
    public String insertUser(User user){

        return "redirect:selectUser";
    }

}
