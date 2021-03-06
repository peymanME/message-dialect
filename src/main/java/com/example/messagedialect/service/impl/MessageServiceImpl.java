package com.example.messagedialect.service.impl;

import com.example.messagedialect.component.MessageComponent;
import com.example.messagedialect.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

/*
 * @author : Peyman Ekhtiar
 * @date : 1/26/2020
 * @project : message-dialect
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired MessageComponent messageComponent;


    @Override
    public void printMessage(Locale locale) {
        System.out.println("Example message in service side: " + messageComponent.get("title", locale));
        System.out.println("Language is : " + messageComponent.get("replacer.city",locale));

    }
}
