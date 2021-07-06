/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.dto.request;

import com.study.register.enums.PhoneType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
//import javax.validation.constraints;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Samuel
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {
    
    private long id;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;
    
    @Column(nullable = false)
//    @NotEmpty
    private String number;
}
