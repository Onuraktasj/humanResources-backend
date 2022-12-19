package com.onuraktas.humanresources.mapper;


import com.onuraktas.humanresources.client.dto.request.CreateExpensesRequest;
import com.onuraktas.humanresources.client.dto.response.ExpensesDto;
import com.onuraktas.humanresources.model.Expenses;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(implementationName = "ExpensesMapperImpl", componentModel = "spring")
public interface ExpensesMapper {

    Expenses toExpenses(ExpensesDto expensesDto);

    ExpensesDto toExpensesDto(Expenses expenses);

    @Mapping(target = "employee.id", source = "employeeId")
    Expenses toExpensesFromCreateExpensesRequest(CreateExpensesRequest createExpensesRequest);
}
