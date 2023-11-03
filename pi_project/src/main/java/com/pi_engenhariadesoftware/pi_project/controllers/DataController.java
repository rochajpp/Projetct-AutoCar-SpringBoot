package com.pi_engenhariadesoftware.pi_project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pi_engenhariadesoftware.pi_project.entities.Car;
import com.pi_engenhariadesoftware.pi_project.entities.User;
import com.pi_engenhariadesoftware.pi_project.entities.Report;

import com.pi_engenhariadesoftware.pi_project.repositories.CarRepository;
import com.pi_engenhariadesoftware.pi_project.repositories.UserRepository;
import com.pi_engenhariadesoftware.pi_project.repositories.ReportRepository;

@RestController
public class DataController {
    private final CarRepository carRepository;
    private final UserRepository userRepository;
    private final ReportRepository reportRepository;

    public DataController(CarRepository carRepository, UserRepository userRepository, ReportRepository reportRepository) {
        this.carRepository = carRepository;
        this.userRepository = userRepository;
        this.reportRepository = reportRepository;
    }


    @RequestMapping("/admin")
    public ModelAndView checkData(@RequestParam("login") String login, @RequestParam("password") String pass){
        List<User> userList = userRepository.findAll();
        User user = null;

        for(int i = 0; i < userList.size(); i++){
            if(userList.get(i).getLogin().equals(login)){
                if(userList.get(i).getPassword().equals(pass)){
                    user = userList.get(i);
                    break;
                }
            }
        }

        if(user != null){
            System.out.println("Logado com sucesso");
            ModelAndView modelAndView = new ModelAndView("admin");
            return modelAndView;
        }else{
            System.out.println("Credenciais incorretas");
            return null;
        }
    }

    
}

