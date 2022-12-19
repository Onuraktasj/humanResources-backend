package com.onuraktas.humanresources.service;


import com.onuraktas.humanresources.client.dto.request.CreateExpensesRequest;
import com.onuraktas.humanresources.client.dto.response.ExpensesDto;
import com.onuraktas.humanresources.mapper.ExpensesMapper;
import com.onuraktas.humanresources.model.Employee;
import com.onuraktas.humanresources.model.Expenses;
import com.onuraktas.humanresources.repository.ExpensesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExpensesService {

    private final ExpensesRepository expensesRepository;

    private final ExpensesMapper expensesMapper;

    public ExpensesDto createExpenses(CreateExpensesRequest createExpensesRequest){
        Expenses expenses = expensesMapper.toExpensesFromCreateExpensesRequest(createExpensesRequest);

        return expensesMapper.toExpensesDto(expensesRepository.save(expenses));
    }

    public List<ExpensesDto> getAllExpenses(){

        List<Expenses> expensesList = expensesRepository.findAll();
        return expensesList.stream()
                .map(expensesMapper::toExpensesDto)
                .collect(Collectors.toList());

    }

}
