package com.example.messagedialect.controller;

import com.example.messagedialect.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;


import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/*
 * @author : Peyman Ekhtiar
 * @date : 1/26/2020
 * @project : message-dialect
 */
@Controller
public class HomeController {

    @Autowired MessageService messageService;

    @RequestMapping(value={"","/home"})
    public String index (Locale locale){
        messageService.printMessage( locale);
        return "index";
    }
/*
    private MessageService messageService;

    public HomeController(MessageService messageService){
        this.messageService = messageService;
    }

    @RequestMapping(value={"","/home"})
    public String index (Locale locale){
        messageService.printMessage( locale);
        return "index";
    }
*/


}
