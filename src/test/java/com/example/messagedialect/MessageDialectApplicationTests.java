package com.example.messagedialect;

import com.example.messagedialect.config.MessageConfig;
import com.example.messagedialect.controller.HomeController;
import com.example.messagedialect.service.MessageService;
import com.sun.glass.ui.Application;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CorsFilter;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MessageDialectApplicationTests {

    @Autowired
    private MockMvc mockMvc;

/*
    @Autowired
    private WebApplicationContext webApplicationContext;

    @InjectMocks
    private HomeController home;


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

//        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        this.mockMvc = MockMvcBuilders.standaloneSetup(home).build();
    }

    @After
    public void rollbackTransaction() {
    }
*/
 /*   @Test
    public void main() {
        try {
            SpringApplication.run(MessageDialectApplicationTests.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/


    @Test
    public void runProject () throws Exception{
        this.mockMvc.perform(get("/home")).andDo(print());
    }




}
