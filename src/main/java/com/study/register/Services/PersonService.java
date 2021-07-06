/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.Services;

import com.study.register.dto.mapper.PersonMapper;
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
    private final PersonMapper personMapper = PersonMapper.ISNTANCE;
    
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    
    public String CreatePerson(@RequestBody PersonDTO personDTO) {
        
        Person person = personMapper.toModel(personDTO);
        
        Person savedPerson = personRepository.save(person);
        
        return "Created, ID - "+savedPerson.getId();
    }

    public void listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
