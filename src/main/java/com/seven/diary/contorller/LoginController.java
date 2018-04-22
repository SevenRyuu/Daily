package com.seven.diary.contorller;

import com.seven.diary.model.User;
import com.seven.diary.service.LoginService;
import com.seven.diary.vo.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(){

        return "home";
    }

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @ResponseBody
    @RequestMapping("/register")
    public ResultResponse register(User userVO){

        return loginService.register(userVO);
    }
}
