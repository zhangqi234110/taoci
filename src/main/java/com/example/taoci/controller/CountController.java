package com.example.taoci.controller;

import com.example.taoci.pojo.Count;
import com.example.taoci.pojo.User;
import com.example.taoci.service.CountService;
import com.example.taoci.service.UserService;
import com.example.taoci.util.JedisTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/zhangdan")
public class CountController {
    @Autowired
    private UserService userService;

    @Autowired
    private CountService countService;

    @RequestMapping("/hello")
    public String aa(){
        String ss="这是我写的";
        return ss;
    }


    @RequestMapping("/hello1")
    public String bb(){
        String aa="这是同时新添加的";
        return aa;
    }
    @RequestMapping("/hello2")
    public String de(){
        String qw="麻辣烫";
        return qw;
    }

    @RequestMapping("/hello3")
    public String wa(){
        String qw="再重新形成创造性";
        return qw;
    }

    @RequestMapping("/hello5")
    public String sdas(){

        return "nisd s";
    }



    @RequestMapping("/list")
    public String list(@RequestParam("name") String name, @RequestParam("password") String password, Model model){
        User login = userService.login(name, password);
        if (login==null){
            return "error";
        }else {
            String set = JedisTool.jedisset().set(name, name);
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

    @RequestMapping("/red")
    public String de(RedirectAttributes redirectAttributes){
        //redirectAttributes.addAttribute("name","张三");
       redirectAttributes.addFlashAttribute("name","张三");
        return "redirect:/zhangdan/red2";
    }

    @RequestMapping("/red2")
    public String we(@ModelAttribute("name") String name){
        System.out.println(name);
        return "qweqwew";
    }


}
