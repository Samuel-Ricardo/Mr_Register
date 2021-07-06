/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.register.dto.response;

import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 *
 * @author Samuel
 */

@Builder
@AllArgsConstructor
@Getter
@Setter
public class Response<Data> {
    
//    private Optional<Data> data;
    private Data data;
    private String message;
    private HttpStatus status;
    
}
