package com.pi_engenhariadesoftware.pi_project.Services;

import java.util.Arrays;
import java.util.Optional;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieService {
    public static void setCookie(HttpServletResponse response, String key, String value, int seconds){
        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(seconds);
        response.addCookie(cookie);
    }

    public static String getCookie(HttpServletRequest request ,String key){
        return Optional.ofNullable(request.getCookies())
        .flatMap(cookies -> Arrays.stream(cookies)
        .filter(cookie -> key.equals(cookie.getName()))
        .findAny())
        .map(e -> e.getValue())
        .orElse(null);
    }
}
