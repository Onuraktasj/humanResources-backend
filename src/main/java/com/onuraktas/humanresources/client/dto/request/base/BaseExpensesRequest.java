package com.onuraktas.humanresources.client.dto.request.base;


import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BaseExpensesRequest {

    @NotBlank(message = "Amount cannot empty")
    private Double amount;

    private Long employeeId;

}
