package com.onuraktas.humanresources.service;


import com.onuraktas.humanresources.client.dto.request.CreatePermissionRequest;
import com.onuraktas.humanresources.client.dto.response.PermissionDto;
import com.onuraktas.humanresources.mapper.PermissionMapper;
import com.onuraktas.humanresources.model.Permission;
import com.onuraktas.humanresources.repository.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PermissionService {

    private final PermissionRepository permissionRepository;

    private  final PermissionMapper permissionMapper;

    public PermissionDto createPermission(CreatePermissionRequest createPermissionRequest){
        Permission permission = permissionMapper.toPermissionFromCreatePermissionRequest(createPermissionRequest);

        return permissionMapper.toPermissionDto(permissionRepository.save(permission));
    }

    public List<PermissionDto> getAllPermission(){
        List<Permission> permissionList = permissionRepository.findAll();

        return permissionList.stream()
                .map(permissionMapper::toPermissionDto)
                .collect(Collectors.toList());
    }
}
