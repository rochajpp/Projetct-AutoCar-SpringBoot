package com.pi_engenhariadesoftware.pi_project.controllers;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pi_engenhariadesoftware.pi_project.Services.CookieService;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AdminController {
    
    @GetMapping("/admin")
    public String admin(HttpServletRequest request, Model model) throws UnsupportedEncodingException{
        String id = CookieService.getCookie(request, "userId");
        model.addAttribute("id", id);

        return "admin";
    }

    
    
}
