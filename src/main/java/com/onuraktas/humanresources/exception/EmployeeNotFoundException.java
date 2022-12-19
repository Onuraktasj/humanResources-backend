package com.onuraktas.humanresources.exception;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String messsage){
        super(messsage);
    }
}
