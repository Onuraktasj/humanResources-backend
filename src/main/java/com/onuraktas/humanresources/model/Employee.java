package com.onuraktas.humanresources.model;


import com.onuraktas.humanresources.model.enums.Department;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    @Enumerated
    private Department department;

    private LocalDate birthDate;

    @OneToMany
    private List<Expenses> expenses;

    @OneToMany
    private List<Permission> permission;

}
