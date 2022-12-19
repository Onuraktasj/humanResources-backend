package com.onuraktas.humanresources.controller;


import com.onuraktas.humanresources.client.dto.request.CreateEmployeeRequest;
import com.onuraktas.humanresources.client.dto.response.EmployeeDto;
import com.onuraktas.humanresources.model.Employee;
import com.onuraktas.humanresources.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    public ResponseEntity<EmployeeDto> createEmployee( @RequestBody CreateEmployeeRequest createEmployeeRequest){
        System.out.println(createEmployeeRequest.toString());
        return ResponseEntity.ok(employeeService.createEmployee(createEmployeeRequest));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<EmployeeDto>> getAllEmployee(){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id){

        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    //update yazilacak

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }



}

