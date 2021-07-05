/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.Services;

import com.study.register.entity.Person;
import com.study.register.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Samuel
 */
public class PersonService {
    
    private PersonRepository personRepository;
    
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    
    public String CreatePerson(@RequestBody Person person) {
        
        Person savedPerson = personRepository.save(person);
        
        return "Created, ID - "+savedPerson.getId();
    }
}
