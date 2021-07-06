/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Samuel
 */

@Builder
@AllArgsConstructor
@Getter
@Setter
public class Response<Data> {
    
    private Data data;
    private String message;
    private String status;
    
}
