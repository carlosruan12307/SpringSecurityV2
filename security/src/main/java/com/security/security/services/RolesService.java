package com.security.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.security.security.models.RolesModel;
import com.security.security.repository.RoleRepository;
import com.security.security.response.RolesResponse;

import lombok.Data;

@Service
@Data
public class RolesService {

    @Autowired
    private RoleRepository rr;
    @Autowired
    private RolesResponse roleResponse;

    public ResponseEntity<RolesResponse> cadastrarRole(RolesModel role){
        rr.save(role);
        roleResponse.setMensagem("role cadastrada com sucesso");
        return new ResponseEntity<RolesResponse>(roleResponse, HttpStatus.OK);
    }
}
