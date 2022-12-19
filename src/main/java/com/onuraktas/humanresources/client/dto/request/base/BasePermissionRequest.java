package com.onuraktas.humanresources.client.dto.request.base;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.onuraktas.humanresources.model.Permission;
import com.onuraktas.humanresources.model.enums.PermissionType;
import lombok.*;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BasePermissionRequest {

    @NotBlank(message = "Start of permission cannot empty")
    private Date startOfPermission;

    @NotBlank(message = "Finish of permission cannot empty")
    private Date finishOfPermission;

    @Enumerated
    private PermissionType permissionType;

    private Long employeeId;

}
