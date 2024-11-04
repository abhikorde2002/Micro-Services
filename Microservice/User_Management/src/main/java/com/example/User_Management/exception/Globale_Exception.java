package com.example.User_Management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.User_Management.payload.ApiResponse;

public class Globale_Exception {

    @ExceptionHandler(Resouce_Not_Found.class)
    public ResponseEntity<ApiResponse> handle_Exception(Resouce_Not_Found exFound) {
     String message=  exFound.getMessage();
     ApiResponse response= ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
     return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
    }
}
