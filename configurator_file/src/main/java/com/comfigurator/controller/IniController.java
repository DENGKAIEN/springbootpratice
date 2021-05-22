package com.comfigurator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IniController {
    @RequestMapping("test")
    public String init(){
        return "hello";
    }
}
