/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Samuel
 */

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    
    @Id
    private Long id;
    
    private String fristName;
    
    private String lastName;
    
    private String cpf;
    
    private LocalDate birthDate;
    
    private List<Phone> phones;
}
