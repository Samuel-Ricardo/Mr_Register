/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.Services;

import com.study.register.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.study.register.repository.PersonRepository;

/**
 *
 * @author Samuel
 */
public class PersonService {
    
    private PersonService personService;
    
    @Autowired
    public PersonService(PersonService personService) {
        this.personService = personService;
    }
    
    public String CreatePerson(@RequestBody Person person) {
        
        return personService.CreatePerson(person);
    }
    
    
}
