package com.example.User_Management.exception;

public class Resouce_Not_Found extends RuntimeException {
    
    public Resouce_Not_Found(){
        super("Resource Not found exception ");
    }

    public Resouce_Not_Found(String message){
        super(message);
    }
}
