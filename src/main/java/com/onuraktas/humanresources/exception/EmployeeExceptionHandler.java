package com.onuraktas.humanresources.exception;


import com.onuraktas.humanresources.client.dto.response.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class EmployeeExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<?> employeeNotNull(EmployeeNotFoundException employeeNotNullException){
        ErrorResponse errorResponse = new ErrorResponse("Employee Not Found ");
        return ResponseEntity.badRequest().body(errorResponse);

    }

}
