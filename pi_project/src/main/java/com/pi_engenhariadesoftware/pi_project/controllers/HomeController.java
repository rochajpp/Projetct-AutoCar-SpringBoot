package com.pi_engenhariadesoftware.pi_project.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pi_engenhariadesoftware.pi_project.entities.User;
import com.pi_engenhariadesoftware.pi_project.repositories.UserRepository;

import ch.qos.logback.core.model.Model;


@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){      
        return "home";
    }
    
}
