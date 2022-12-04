package com.security.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.security.models.RolesModel;
import com.security.security.models.UsuarioModel;
import com.security.security.repository.RoleRepository;
import com.security.security.repository.UsuarioRepository;
import com.security.security.response.RolesResponse;
import com.security.security.response.UsuarioResponse;

import lombok.Data;

@Service
@Data
public class UsuarioService {

    @Autowired
    private UsuarioResponse r;
    @Autowired
    private UsuarioRepository ur;
    @Autowired
    private PasswordEncoder passwordEncoder;
   

    public ResponseEntity<UsuarioResponse> cadastrarUsuario(UsuarioModel usuario){
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));   
        ur.save(usuario);
            r.setMensagem("usuario cadastrado com sucesso");
            return new ResponseEntity<UsuarioResponse>(r, HttpStatus.OK);
    }
    

    
}
