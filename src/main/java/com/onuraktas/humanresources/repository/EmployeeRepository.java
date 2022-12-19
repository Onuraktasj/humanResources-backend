package com.onuraktas.humanresources.repository;

import com.onuraktas.humanresources.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
