package com.example.messagedialect.service;

import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

/*
 * @author : Peyman Ekhtiar
 * @date : 1/26/2020
 * @project : message-dialect
 */
public interface MessageService {
    void printMessage (Locale locale);
}
