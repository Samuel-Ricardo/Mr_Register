/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.dto.request;

import com.study.register.enums.PhoneType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
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
    private PhoneType type;
    
    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;
}
