package com.pi_engenhariadesoftware.pi_project.Services.Authentication;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.pi_engenhariadesoftware.pi_project.Services.CookieService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AdminInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request,  HttpServletResponse response, Object handler) throws Exception{
        if(CookieService.getCookie(request, "userId") != null){
            return true;
        }

        response.sendRedirect("/admin");
        return false;
        
    }
}
