package com.example.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class navigationController {
    @RequestMapping("/")
    String homePage(){
        return "index";
    }
}
