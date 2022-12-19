package com.onuraktas.humanresources.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private String description;

    @ManyToOne
    private Employee employee;


}
