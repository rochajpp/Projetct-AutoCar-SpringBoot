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


    @RequestMapping("/checkData")
    public void checkData(@RequestParam("login") String login, @RequestParam("password") String pass){
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
        }else{
            System.out.println("Credenciais incorretas");
        }
    }

    @RequestMapping("/interest")
    public String interest(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam("phone") String phone){
        
        // Adicionando true para interresse do carro
        Car car = carRepository.getReferenceById(id);
        car.setInterest(true);
        carRepository.save(car);
        
        Report report = new Report(car, name, phone);
        reportRepository.save(report);

        return "<!DOCTYPE html>\r\n" + //
                "<html lang=\"en\">\r\n" + //
                "<head>\r\n" + //
                "    <meta charset=\"UTF-8\">\r\n" + //
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //

                "    <link rel='icon' href='/img/icon.png'>\r\n" + 
                "    <title>Interest</title>\r\n" + //
                "</head>\r\n" + //
                "<style>\r\n" +
                "body{\r\n" +
                    "height: 100%;\r\n" +
                    "background-color: rgb(28, 28, 28);\r\n" +
                    "display: flex;\r\n" +
                    "justify-content: center;\r\n" +
                    "align-items: center;\r\n" +
                "}\r\n" +
                "main{\r\n" +
                    "display: flex;\r\n" +
                    "flex-direction: column;\r\n" +
                    "justify-content: center;\r\n" +
                    "align-items: center;\r\n" +
                    "gap: 1rem;\r\n" +
                    "font-family: sans-serif;\r\n" +
                    "color: white;\r\n" +
                "}\r\n" +
                
                "button{\r\n" +
                    "padding: 1rem 2rem;\r\n" +
                    "border: none;\r\n" +
                    "background-color: red;\r\n" +
                    "color: white;\r\n" +
                    "border-radius: 0.2rem;\r\n" +
                    "cursor: pointer;\r\n" +
                    "transition: 0.5s;\r\n" +
                "}\r\n" +
            "</style>\r\n" +
                "<body>\r\n" + //
                "    <main>\r\n" + //          
                "       <h1>Interest registered sucessfully!</h1>\r\n" + //
                "       <a href=\"/\"><button>Back to home</button></a>\r\n" + //                  
                "    </main>\r\n" + //
                "</body>\r\n" + //
                "</html>";
       
    }
}

