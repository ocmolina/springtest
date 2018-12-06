/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ovidiomolina.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author omoli
 */
@RestController
public class HelloController {
    
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public ResponseEntity<?> hello() {
        return new ResponseEntity("hello there!", HttpStatus.OK);
    }
}
