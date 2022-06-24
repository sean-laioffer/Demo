package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.RegisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class RegisterController {
    private RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping("/register")
    public void addGuest(@RequestBody User user) {
        registerService.add(user);
    }

}
