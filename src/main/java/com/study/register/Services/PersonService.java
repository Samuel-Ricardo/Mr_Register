/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.Services;

import com.study.register.dto.request.PersonDTO;
import com.study.register.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.study.register.repository.PersonRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Samuel
 */

@Service
public class PersonService {
    
    private PersonRepository personRepository;
    
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    
    public String CreatePerson(@RequestBody PersonDTO personDTO) {
        
        Person savedPerson = personRepository.save(personDTO);
        
        return "Created, ID - "+savedPerson.getId();
    }
    
    
}
