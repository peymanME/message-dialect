package com.example.messagedialect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @author : Peyman Ekhtiar
 * @date : 1/26/2020
 * @project : message-dialect
 */
@Controller
public class HomeController {

    @RequestMapping(value={"","/home"})
    public String index (){
        return "index";
    }
}
