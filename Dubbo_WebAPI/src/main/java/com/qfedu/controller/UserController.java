package com.qfedu.controller;

import com.qfedu.entity.user.User;
import com.qfedu.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("selectById.do")
    public User selectById(int id){

        return userService.selectId (id);

    }


}
