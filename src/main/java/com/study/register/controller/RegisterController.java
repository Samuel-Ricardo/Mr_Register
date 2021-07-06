/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.controller;

import com.study.register.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.study.register.Services.PersonService;
import com.study.register.dto.request.PersonDTO;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Samuel
 */

@RestController
@RequestMapping("/api/v1/people")
public class RegisterController {
    
    private PersonService personService;

    @Autowired
    public RegisterController(PersonService personRepository) {
        this.personService = personRepository;
    }
    
//    @GetMapping 
//    public String getStatus() {
//        return "API Test";
//    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String CreatePerson(@RequestBody @Valid PersonDTO personDTO) {
        
        return personService.CreatePerson(personDTO);
    }
    
    @GetMapping
    public List<PersonDTO> getAll() {
        personService.listAll();
    }
}
