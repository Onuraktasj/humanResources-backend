package com.onuraktas.humanresources.controller;


import com.onuraktas.humanresources.client.dto.request.CreateExpensesRequest;
import com.onuraktas.humanresources.client.dto.response.EmployeeDto;
import com.onuraktas.humanresources.client.dto.response.ExpensesDto;
import com.onuraktas.humanresources.service.ExpensesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin
public class ExpensesController {

    private final ExpensesService expensesService;

    public ExpensesController(ExpensesService expensesService){
        this.expensesService = expensesService;
    }


    @PostMapping("/create")
    public ResponseEntity<ExpensesDto> createExpenses(@RequestBody CreateExpensesRequest createExpensesRequest){
        return ResponseEntity.ok(expensesService.createExpenses(createExpensesRequest));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ExpensesDto>> getAllExpenses(){
        return ResponseEntity.ok(expensesService.getAllExpenses());
    }


}
