/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.controller;

import com.study.register.Exception.PersonNotFoundException;
import com.study.register.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.study.register.Services.PersonService;
import com.study.register.dto.request.PersonDTO;
import com.study.register.dto.response.Response;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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
       return personService.listAll();
    }
    
    @GetMapping("/{id}")
    public PersonDTO findById(@PathVariable long id) throws PersonNotFoundException{
        
        return personService.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable long id) throws PersonNotFoundException{
        
        return personService.deleteById(id);
    } 
    
    @PutMapping("/{id}")
    public Response<PersonDTO> updateById(@PathVariable long id, @RequestBody PersonDTO personDTO) throws PersonNotFoundException {
        
        return personService.updateById(id,personDTO);
    }
}
