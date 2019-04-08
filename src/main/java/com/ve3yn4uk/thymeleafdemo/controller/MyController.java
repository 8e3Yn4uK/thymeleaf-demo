package com.ve3yn4uk.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 8e3Yn4uK on 08.04.2019
 */

@Controller
public class MyController {

    @GetMapping("/hello")
    public String sayHello(Model model){

        model.addAttribute("theDate", new java.util.Date());

        return "helloworld";
    }
}
