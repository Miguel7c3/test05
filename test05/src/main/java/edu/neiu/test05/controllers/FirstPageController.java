package edu.neiu.test05.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/firstpage")
public class FirstPageController {

    @GetMapping
    public String getFirstPage(){
        return "first-page";
    }

}
