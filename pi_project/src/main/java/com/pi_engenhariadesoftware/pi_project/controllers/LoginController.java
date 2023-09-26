package com.pi_engenhariadesoftware.pi_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @PostMapping("/checkData")
    public void checkData(@RequestParam("login") String login, @RequestParam("password") String pass){
        
    }
}
