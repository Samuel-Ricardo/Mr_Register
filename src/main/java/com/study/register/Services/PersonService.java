/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.Services;

import com.study.register.Exception.PersonNotFoundException;
import com.study.register.dto.mapper.PersonMapper;
import com.study.register.dto.request.PersonDTO;
import com.study.register.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import com.study.register.repository.PersonRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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

        return "Created, ID - " + savedPerson.getId();
    }

    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();

        return allPeople.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDTO findById(long id) throws PersonNotFoundException {

        Person person = verifyIfExist(id);

        return personMapper.toDTO(person);
    }

    public String deleteById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Person verifyIfExist(long id) throws PersonNotFoundException {
        Person person = personRepository.findById(id).
                orElseThrow(() -> new PersonNotFoundException(id));
        return person;
    }

}
