package com.pi_engenhariadesoftware.pi_project.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pi_engenhariadesoftware.pi_project.Services.CookieService;
import com.pi_engenhariadesoftware.pi_project.entities.Car;
import com.pi_engenhariadesoftware.pi_project.entities.User;
import com.pi_engenhariadesoftware.pi_project.repositories.CarRepository;
import com.pi_engenhariadesoftware.pi_project.repositories.UserRepository;

import org.springframework.ui.Model;

import jakarta.persistence.criteria.Path;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AdminController {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private UserRepository userRepository;


    
    @GetMapping("/admin")
    public String admin(HttpServletRequest request, Model model) throws UnsupportedEncodingException{
        String id = CookieService.getCookie(request, "userId");
        model.addAttribute("id", id);

        return "admin";
    }

    @GetMapping("/backCar")
    public String backCar(String idCar){
        Long id = Long.parseLong(idCar);
        Car car = carRepository.getReferenceById(id);

        car.setInterest();

        carRepository.save(car);

        return "redirect:/admin";
    }

    @GetMapping("/rmCar")
    public String rmCar(String idCar){

        Long id = Long.parseLong(idCar);

        carRepository.deleteById(id);

        return "redirect:/admin";
    }

    @GetMapping("/setCar")
    public String setCar(String idCar, Model model){
        Car car = carRepository.getReferenceById(Long.parseLong(idCar));

        model.addAttribute("id", idCar);
        model.addAttribute("brand", car.getBrand());
        model.addAttribute("model", car.getModel());
        model.addAttribute("value", car.getValue());
        model.addAttribute("description", car.getDescription());
        model.addAttribute("image", car.getImage());
        model.addAttribute("manufactureYear", car.getManufactureYear());
        model.addAttribute("modelYear", car.getModelYear());

        return "setCar";
    }
    
    @PostMapping("/setCarSys")
    public String setCarSys(Car car, @RequestParam("id") String id, @RequestParam("file") MultipartFile file, Model model){
        Car carUp = carRepository.getReferenceById(Long.parseLong(id));
        
        carUp.setBrand(car.getBrand());
        carUp.setModel(car.getModel());
        carUp.setValue(car.getValue());
        carUp.setDescription(car.getDescription());
        carUp.setManufactureYear(car.getManufactureYear());
        carUp.setModelYear(car.getModelYear());

        if(!file.isEmpty()){
            String fileName = file.getOriginalFilename();        
            String dirProject = System.getProperty("user.dir");

            try{
                String dirUploadImage = dirProject + "\\pi_project\\src\\main\\resources\\static\\img";
                File dir = new File(dirUploadImage);
                if(!dir.exists()){
                    dir.mkdirs();
                }

                File serverFile = new File(dir.getAbsolutePath() + File.separator + fileName);

                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));

                stream.write(file.getBytes());
                stream.close();

                carUp.setImage("/img/" + fileName);             

            } catch(Exception e){   
                model.addAttribute("error", "Image error!");  
                return "setCar?idCar=" + car.getID();
            }         
        }    
        carRepository.save(carUp);
        return "redirect:/admin";
    }

    @GetMapping("/addCar")
    public String addCar(){
        return "addCar";
    }

    @PostMapping("/saveCar")
    public String saveCar(Car car, @RequestParam("file") MultipartFile file, Model model){
        System.out.println(car.getBrand());
         if(!file.isEmpty()){
            String fileName = file.getOriginalFilename();        
            String dirProject = System.getProperty("user.dir");

            try{
                String dirUploadImage = dirProject + "\\pi_project\\src\\main\\resources\\static\\img";
                File dir = new File(dirUploadImage);
                if(!dir.exists()){
                    dir.mkdirs();
                }

                File serverFile = new File(dir.getAbsolutePath() + File.separator + fileName);

                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));

                stream.write(file.getBytes());
                stream.close();            

            } catch(Exception e){   
                model.addAttribute("error", "Image error!");  
                return "/addCar";     
            }

            car.setImage("/img/" + fileName);
            car.setRegisterDate(LocalDate.now());

            carRepository.save(car);

            return "redirect:/admin";
        }

        return "/addCar";
    }
    
}
