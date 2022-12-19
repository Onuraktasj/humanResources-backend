package com.onuraktas.humanresources.model;


import com.onuraktas.humanresources.model.enums.PermissionType;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date startOfPermission;

    private Date finishOfPermission;

    private Integer totalPermission;

    @ManyToOne
    private Employee employee;

    @Enumerated
    private PermissionType permissionType;

}
