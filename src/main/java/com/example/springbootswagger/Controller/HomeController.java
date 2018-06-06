package com.example.springbootswagger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value = {"/","/index","home"})
    @ResponseBody
    public String home(){
        return "hello world";
    }
}
