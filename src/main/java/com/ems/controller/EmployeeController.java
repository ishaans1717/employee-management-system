package com.ems.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @PostMapping(value = "/helloWorld")
    public void helloWorld(){
        System.out.println("hello world");

    }
}
