package com.reshined.consumer.controller;

import com.reshined.consumer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/buyTicket")
    public String buyTicket(){
        return iUserService.bugTicket("yang");
    }

}
