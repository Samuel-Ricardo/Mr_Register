/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.controller;

import com.study.register.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Samuel
 */

@RestController
@RequestMapping("/api/v1/people")
public class RegisterController {
    
    private PersonRepository personRepository;

    @Autowired
    public RegisterController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    
    @GetMapping 
    public String getStatus() {
        return "API Test";
    }
    
    
}
