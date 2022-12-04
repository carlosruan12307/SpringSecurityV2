package com.security.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.security.models.RolesModel;
import com.security.security.response.RolesResponse;
import com.security.security.services.RolesService;

import lombok.Data;

@RestController
@Data
public class RolesController {

    @Autowired
    private RolesService rl;

    @PostMapping("/cadastrarRole")
    public ResponseEntity<RolesResponse> cadastrarRole(@RequestBody RolesModel role){
        return rl.cadastrarRole(role);
    }
    
}
