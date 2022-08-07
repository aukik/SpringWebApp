package com.webapp.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @RequestMapping("home")
    public void home(){
        System.out.println("hi");
    }
}
