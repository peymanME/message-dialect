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
    @Autowired LocaleResolver localeResolver;

    @RequestMapping(value={"","/home"})
    public String index (HttpServletRequest request){
        Locale locale = localeResolver.resolveLocale(request);
        messageService.printMessage( locale);
        return "index";
    }
}
