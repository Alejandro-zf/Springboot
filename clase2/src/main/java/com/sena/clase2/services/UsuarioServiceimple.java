package com.sena.clase2.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.sena.clase2.dto.UsuarioDto;
import com.sena.clase2.mapper.UsuarioMapper;
import com.sena.clase2.models.Usuario;
import com.sena.clase2.reposirtoryes.UsuarioRepositorie;

public class UsuarioServiceimple {

    public class InnerUsuarioServiceimple implements UsuarioServices{    
    @Autowired
        private UsuarioRepositorie userRepo;
        private UsuarioMapper userMapper;    
    @Override
        public UsuarioDto getUsuario(Integer usuarioid){
        Usuario usuario = userRepo.findById(usuarioid).get();
        return userMapper.toUsuarioDto(usuario);
    }
}
}