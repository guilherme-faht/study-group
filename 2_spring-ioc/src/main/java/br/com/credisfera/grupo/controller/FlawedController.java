package br.com.credisfera.grupo.controller;

import org.springframework.stereotype.Controller;

import br.com.credisfera.grupo.service.MyService;

@Controller
public class FlawedController {
    
    public String control() {
        MyService userService = new MyService();
        return userService.serve();
    }

}
