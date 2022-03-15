package br.com.credisfera.grupo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.credisfera.grupo.service.MyService;

@Controller
public class CorrectController {
    
    @Autowired
    MyService myService;
    
    public String control() {
        return myService.serve();
    }

}
