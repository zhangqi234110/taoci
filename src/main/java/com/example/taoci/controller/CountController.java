package com.example.taoci.controller;

import com.example.taoci.pojo.User;
import com.example.taoci.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mycount")
public class CountController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String list(@RequestParam("name") String name,@RequestParam("password") String password){
        User login = userService.login(name, password);
        if (login==null){
            return "error";
        }else {
            return "success";
        }

    }
}
