/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.factory;

import com.study.register.dto.mapper.PersonMapper;
import com.study.register.dto.request.PersonDTO;
import com.study.register.dto.request.PhoneDTO;
import com.study.register.entity.Person;
import com.study.register.entity.Phone;
import com.study.register.enums.PhoneType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.NoArgsConstructor;

/**
 *
 * @author Samuel
 */
@NoArgsConstructor
public class PersonFactory {
    
    public static PersonDTO createFakeDTO(){
        
        PhoneDTO phone = new PhoneDTO(1, PhoneType.MOBILE, "(01) 91234-5678");
        PhoneDTO housePhone = new PhoneDTO(1, PhoneType.HOME, "(02) 94321-8765");
        
        List<PhoneDTO> phones = new ArrayList<PhoneDTO>();
        
        phones.add(phone);
        phones.add(housePhone);
        
        return new PersonDTO(
                Long.getLong("1"), 
                "Samuel", 
                "Ricardo", 
                "123.456.789-25", 
                LocalDate.now(), 
                phones);
    }

    public static Person createFakeEntity(){
        
        PersonDTO fakeDTO = createFakeDTO();
        
        PersonMapper mapper = PersonMapper.ISNTANCE;
        
        return mapper.toModel(fakeDTO);
    }

}
