/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.dto.request;

import java.time.LocalDate;
import java.util.List;
import javax.validation.Valid;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.validator.constraints.br.CPF;

/**
 *
 * @author Samuel
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    
    private Long id;
    
    @NotEmpty
    @Size(min = 2, max = 100)
    private String fristName;
    
    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;
    
    @NotEmpty
    @CPF
    private String cpf;
    
    private LocalDate birthDate;
    
    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;
}
