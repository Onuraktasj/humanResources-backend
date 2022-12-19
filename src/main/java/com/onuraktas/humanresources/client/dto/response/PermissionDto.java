package com.onuraktas.humanresources.client.dto.response;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Enumerated;
import java.util.Date;

@Getter
@Setter
public class PermissionDto {

    private Long id;

    private Date startOfPermission;

    private Date finishOfPermission;

    @Enumerated
    private PermissionTypeDto permissionTypeDto;

}
