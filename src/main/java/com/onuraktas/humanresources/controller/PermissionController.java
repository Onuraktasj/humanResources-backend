package com.onuraktas.humanresources.controller;


import com.onuraktas.humanresources.client.dto.request.CreatePermissionRequest;
import com.onuraktas.humanresources.client.dto.response.PermissionDto;
import com.onuraktas.humanresources.service.PermissionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/permission")
@CrossOrigin
public class PermissionController {

    private final PermissionService permissionService;

    public PermissionController(PermissionService permissionService){
        this.permissionService = permissionService;
    }

    @PostMapping("/create")
    public ResponseEntity<PermissionDto> createPermission(@RequestBody CreatePermissionRequest createPermissionRequest){
        return ResponseEntity.ok(permissionService.createPermission(createPermissionRequest));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PermissionDto>> findAllPermission(){
        return ResponseEntity.ok(permissionService.getAllPermission());
    }

    
}
