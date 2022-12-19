package com.onuraktas.humanresources.mapper;


import com.onuraktas.humanresources.client.dto.request.CreatePermissionRequest;
import com.onuraktas.humanresources.client.dto.response.PermissionDto;
import com.onuraktas.humanresources.model.Permission;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(implementationName ="PermissionMapperImpl", componentModel = "spring")
public interface PermissionMapper {

    Permission toPermission(PermissionDto permissionDto);
    @Mapping(target = "permissionTypeDto",source = "permissionType")
    PermissionDto toPermissionDto(Permission permission);
    @Mapping(target = "employee.id", source = "employeeId")
    Permission toPermissionFromCreatePermissionRequest(CreatePermissionRequest createPermissionRequest);
}
