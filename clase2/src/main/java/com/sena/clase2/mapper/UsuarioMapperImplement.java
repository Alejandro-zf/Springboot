package com.sena.clase2.mapper;

import org.springframework.stereotype.Component;
import com.sena.clase2.dto.UsuarioDto;
import com.sena.clase2.models.Usuario;

@Component
public class UsuarioMapperImplement implements UsuarioMapper{

     @Override
     public Usuario toUsuarios(UsuarioDto usuarioDto){
     if(usuarioDto == null){
        return null;
    }

    Usuario usuario = new Usuario();
    usuario.setId_usuario(usuarioDto.getId_usuario());
    usuario.setNombre(usuarioDto.getNombre());
    usuario.setApellido(usuarioDto.getApellido());
    usuario.setCiudad(usuarioDto.getCiudad());
    return usuario;
}

     @Override
     public UsuarioDto toUsuarioDto(Usuario usuario) {
        if (usuario == null){
            return null;
        } 
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setId_usuario(usuario.getId_usuario());
        usuarioDto.setNombre(usuario.getNombre());
        usuarioDto.setApellido(usuario.getApellido());
        usuarioDto.setCiudad(usuario.getCiudad());
        return usuarioDto; 
     }
}

