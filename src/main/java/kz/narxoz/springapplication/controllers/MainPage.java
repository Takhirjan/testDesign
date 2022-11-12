package kz.narxoz.springapplication.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPage {
    @GetMapping(value="/m")
    public String index(){
        return "mainpage";
    }
}
