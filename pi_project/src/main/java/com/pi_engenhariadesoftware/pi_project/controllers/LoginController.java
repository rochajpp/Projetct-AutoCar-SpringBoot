package com.pi_engenhariadesoftware.pi_project.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pi_engenhariadesoftware.pi_project.Services.CookieService;
import com.pi_engenhariadesoftware.pi_project.entities.User;
import com.pi_engenhariadesoftware.pi_project.repositories.UserRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

   @PostMapping("/checkLogin")
   public String checkLogin(Model model, User userParam, HttpServletResponse response) throws IOException{
        User user = this.userRepository.login(userParam.getLogin(), userParam.getPassword());
        if(user != null){
            CookieService.setCookie(response, "userId", Integer.toString(user.getId()), 3600);
            CookieService.setCookie(response,"userName", user.getName(), 3600 );
            return "redirect:/admin";
        }
        model.addAttribute("error", "Credenciais inválidas");

        return "login";
   }

   @GetMapping("/exit")
   public String exit(HttpServletResponse response) throws IOException{
        CookieService.setCookie(response, "userId", "", 0);
        return "redirect:/";
   }
    
}
