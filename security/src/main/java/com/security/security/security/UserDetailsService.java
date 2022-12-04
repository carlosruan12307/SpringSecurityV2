package com.security.security.security;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.security.models.UsuarioModel;
import com.security.security.repository.UsuarioRepository;

import lombok.Data;

@Service
@Data
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    
    @Autowired
    private UsuarioRepository ur;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuarioModel usuario =  ur.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("usuario" + username + "nao encontrado"));
    
        return new org.springframework.security.core.userdetails.User(usuario.getUsername(),usuario.getPassword(),true,true,true,true,usuario.getAuthorities());
    }
    
}
