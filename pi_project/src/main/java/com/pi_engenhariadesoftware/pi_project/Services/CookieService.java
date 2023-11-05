package com.pi_engenhariadesoftware.pi_project.Services;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

public class CookieService {
    public static void setCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("user", "João");
        response.addCookie(cookie);
    }
}
