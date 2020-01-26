package com.example.messagedialect.component;

import org.springframework.stereotype.Component;

/*
 * @author : Peyman Ekhtiar
 * @date : 1/26/2020
 * @project : message-dialect
 */
@Component
public interface replacerComponent {

    static String message(String main, String field) {
        return main.replace("%s", field);
    }
}
