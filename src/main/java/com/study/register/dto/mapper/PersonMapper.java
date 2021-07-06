/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.dto.mapper;

import com.study.register.dto.request.PersonDTO;
import com.study.register.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;

/**
 *
 * @author Samuel
 */

@Mapper
public interface PersonMapper {
 
    PersonMapper ISNTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);
    
    PersonDTO toDTO(Person person);
}
