package com.onuraktas.humanresources.repository;

import com.onuraktas.humanresources.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission,Long> {
}
