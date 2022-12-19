package com.onuraktas.humanresources.mapper;


import com.onuraktas.humanresources.client.dto.request.CreateEmployeeRequest;
import com.onuraktas.humanresources.client.dto.response.EmployeeDto;
import com.onuraktas.humanresources.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(implementationName = "EmployeeMapperImpl", componentModel = "spring")
public interface EmployeeMapper {

    Employee toEmployee(EmployeeDto employeeDto);

    EmployeeDto toEmployeeDto(Employee employee);

    Employee toEmployeeFromCreateEmployeeRequest(CreateEmployeeRequest createEmployeeRequest);


}
