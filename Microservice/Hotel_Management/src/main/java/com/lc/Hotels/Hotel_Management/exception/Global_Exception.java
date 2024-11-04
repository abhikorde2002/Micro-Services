package com.lc.Hotels.Hotel_Management.exception;


import java.lang.module.ResolutionException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Global_Exception {
    
     @ExceptionHandler(ResolutionException.class)
     public ResponseEntity<Map<String,Object>> notFound(ResolutionException re){
        Map map = new HashMap();
        map.put("message :- ", re.getMessage());
        map.put("success", false);
        map.put("status", HttpStatus.NOT_FOUND);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
     }
}
