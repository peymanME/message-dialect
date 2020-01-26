package com.example.messagedialect.controller;

import com.example.messagedialect.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @author : Peyman Ekhtiar
 * @date : 1/26/2020
 * @project : message-dialect
 */
@Controller
public class HomeController {
    @Autowired MessageService messageService;

    @RequestMapping(value={"","/home"})
    public String index (){
        messageService.printMessage();
        return "index";
    }
}
