package com.onuraktas.humanresources.client.dto.response;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Enumerated;
import java.time.LocalDate;

@Getter
@Setter
public class EmployeeDto {

    private Long id;

    private String firstName;

    private String lastName;

    private LocalDate  birthDate;

    @Enumerated
    private DepartmentDto department;

    private String phoneNumber;

    private String email;

}
