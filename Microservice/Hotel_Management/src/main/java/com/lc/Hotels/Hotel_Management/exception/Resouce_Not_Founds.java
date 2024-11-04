package com.lc.Hotels.Hotel_Management.exception;

public class Resouce_Not_Founds  extends RuntimeException{
    public Resouce_Not_Founds(){
        super("Resource Not found exception ");
    }

    public Resouce_Not_Founds(String message){
        super(message);
    }
}
