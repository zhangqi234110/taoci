package com.example.taoci.controller;

import com.example.taoci.pojo.Count;
import com.example.taoci.pojo.User;
import com.example.taoci.service.CountService;
import com.example.taoci.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/count")
public class CountController {
    @Autowired
    private UserService userService;

    @Autowired
    private CountService countService;

    @RequestMapping("/list")
    public String list(@RequestParam("name") String name, @RequestParam("password") String password, Model model){
        User login = userService.login(name, password);
        if (login==null){
            return "error";
        }else {
            ArrayList<Object> list = new ArrayList<>();
            List<Count> all = countService.findAll();
            String myname = login.getName();
            /*for (int i=0;i<all.size();i++){
                Date date = all.get(i).getDate();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String format = simpleDateFormat.format(date);
                list.add(format);
            }*/
            model.addAttribute("name",myname);
            model.addAttribute("count",all);

            return "success";
        }

    }
}
