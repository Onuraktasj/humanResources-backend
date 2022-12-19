package com.onuraktas.humanresources.client.dto.request.base;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.onuraktas.humanresources.model.enums.Department;
import lombok.*;

import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BaseEmployeeRequest {

    @NotBlank(message = "First name cannot empty")
    private String firstName;

    @NotBlank(message = "Last name cannot empty")
    private String lastName;

    @Email(regexp = "^(.+)@(.+)$", message = "Email is not valid.Please follow the example:xxx@mail.com")
    private String email;

    @NotBlank(message = "Phone number cannot empty")
    private String phoneNumber;

    private LocalDate birthDate;

    @Enumerated
    private Department department;





}
