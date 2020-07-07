package com.example.taoci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/taoci")
public class UserController {

    @RequestMapping("/welcome")
    public String login(){
        return "login";
    }



}
