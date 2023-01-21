package com.epic2.exception;

public class UserNotPresent extends Exception{
    public UserNotPresent(String details){
        super(details);
    }
}
