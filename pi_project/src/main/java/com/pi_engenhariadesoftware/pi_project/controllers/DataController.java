package com.pi_engenhariadesoftware.pi_project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pi_engenhariadesoftware.pi_project.entities.Car;
import com.pi_engenhariadesoftware.pi_project.entities.User;
import com.pi_engenhariadesoftware.pi_project.repositories.CarRepository;
import com.pi_engenhariadesoftware.pi_project.repositories.UserRepository;

@RestController
public class DataController {
    private final CarRepository carRepository;

    @Autowired
    public DataController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    
    @RequestMapping("/users")
    public List<Car> getAllUsers(){
        return carRepository.findAll();
    }

    @RequestMapping("/checkData")
    @ResponseBody
    public void checkData(@RequestParam("login") String login, @RequestParam("password") String pass){
        System.out.println(login);
    }
}
