package com.sena.clase2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sena.clase2.dto.UsuarioDto;
import com.sena.clase2.mapper.UsuarioMapper;
import com.sena.clase2.models.Usuario;
import com.sena.clase2.reposirtoryes.UsuarioRepositorie;

@Service

    public class InnerUsuarioServiceimple implements UsuarioServices{    
    
    @Autowired
    private UsuarioRepositorie userRepo;

    @Autowired
    private UsuarioMapper userMapper;    
    
    @Override
        public UsuarioDto getUsuario(Integer usuarioid){
        Usuario usuario = userRepo.findById(usuarioid).get();
        return userMapper.toUsuarioDto(usuario);
    }

    @Override 
    public UsuarioDto saveUsuario(UsuarioDto usuarioDto){
        Usuario usuario = userMapper.toUsuarios(usuarioDto);
        return userMapper.toUsuarioDto(userRepo.save(usuario));
    }

    @Override
    public List<UsuarioDto> getUsuarios(){
        List<Usuario> usuarios = userRepo.findAll();
        return userMapper.toUsuarioDtoList(usuarios);
    }

    @Override
    public UsuarioDto deleteUsuario(Integer usuarioid){
        Usuario usuario =userRepo.findById(usuarioid).get();
        userRepo.delete(usuario);
        return userMapper.toUsuarioDto(usuario);
    }
    @Override
        public UsuarioDto updateUser (Integer usuarioid, UsuarioDto usuarioDto){
        Usuario usuario= userRepo.findById(usuarioid).get();
        return userMapper.toUsuarioDto(userRepo.save(usuario));
    }

}