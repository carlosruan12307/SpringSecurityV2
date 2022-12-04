package com.security.security.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.security.models.RolesModel;

@Repository
public interface RoleRepository extends JpaRepository<RolesModel,UUID> {
    
}
