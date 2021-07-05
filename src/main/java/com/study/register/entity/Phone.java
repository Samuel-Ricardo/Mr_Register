/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.entity;

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
public class Phone {
    
    private long id;
    private PhoneType type;
    private String number;
}
