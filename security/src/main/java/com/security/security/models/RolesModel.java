package com.security.security.models;

import java.util.UUID;

import org.springframework.security.core.GrantedAuthority;

import com.security.security.enums.RoleEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "roles")
public class RolesModel implements GrantedAuthority {

    @Id
    @GeneratedValue()
    private UUID idRole;
    @Enumerated(EnumType.STRING)
    private RoleEnum name;
    @Override
    public String getAuthority() {
        // TODO Auto-generated method stub
        return this.name.toString();
    }

    
}
