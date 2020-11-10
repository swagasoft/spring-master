package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    public String loginMessage(){
        System.out.println("Firebox");
        var counter  = 0;
            counter += 1;
        return  "The server has been called " + counter + " time(S)";
    }
}
