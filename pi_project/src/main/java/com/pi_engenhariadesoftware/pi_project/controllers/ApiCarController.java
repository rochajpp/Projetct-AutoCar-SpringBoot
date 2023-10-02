package com.pi_engenhariadesoftware.pi_project.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pi_engenhariadesoftware.pi_project.entities.Car;
import com.pi_engenhariadesoftware.pi_project.repositories.CarRepository;

@RestController
@RequestMapping("/api/car")
public class ApiCarController {

    private CarRepository carRepository;

    public ApiCarController(CarRepository carRepository){
        this.carRepository = carRepository;
    }
    
    @GetMapping("/")
    public List<Car> listCars(){
        return carRepository.findAll();
    }
}

