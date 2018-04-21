package com.seven.diary.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){

        return "home";
    }

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @RequestMapping("/register")
    public String register(){

        return "index";
    }
}
