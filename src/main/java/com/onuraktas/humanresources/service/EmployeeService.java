package com.onuraktas.humanresources.service;

import com.onuraktas.humanresources.client.dto.request.CreateEmployeeRequest;
import com.onuraktas.humanresources.client.dto.request.UpdateEmployeeRequest;
import com.onuraktas.humanresources.client.dto.response.EmployeeDto;
import com.onuraktas.humanresources.exception.EmployeeNotFoundException;
import com.onuraktas.humanresources.mapper.EmployeeMapper;
import com.onuraktas.humanresources.model.Employee;
import com.onuraktas.humanresources.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final EmployeeMapper employeeMapper;

    public EmployeeDto createEmployee(CreateEmployeeRequest createEmployeeRequest){
        Employee employee = employeeMapper.toEmployeeFromCreateEmployeeRequest(createEmployeeRequest);

        return employeeMapper.toEmployeeDto(employeeRepository.save(employee));
    }

    public List<EmployeeDto> getAllEmployee(){
        List<Employee> employeeList = employeeRepository.findAll();

        return employeeList.stream()
                .map(employeeMapper::toEmployeeDto)
                .collect(Collectors.toList());

    }

    public EmployeeDto getEmployeeById(Long id){
        Optional<Employee> customerOptional = employeeRepository.findById(id);

        return customerOptional.map(employeeMapper::toEmployeeDto)
                .orElseThrow(() -> new EmployeeNotFoundException("Customer not exist!"));

    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }


}
