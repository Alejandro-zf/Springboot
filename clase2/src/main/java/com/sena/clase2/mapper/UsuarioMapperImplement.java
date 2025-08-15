package com.sena.clase2.mapper;

import java.util.ArrayList;
import java.util.List;

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
    usuario.setId_usuario(usuarioDto.getId());
    usuario.setNombre(usuarioDto.getNom());
    usuario.setApellido(usuarioDto.getApe());
    usuario.setCiudad(usuarioDto.getCiu());
    return usuario;
}

     @Override
     public UsuarioDto toUsuarioDto(Usuario usuario) {
        if (usuario == null){
            return null;
        } 
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setId(usuario.getId_usuario());
        usuarioDto.setNom(usuario.getNombre());
        usuarioDto.setApe(usuario.getApellido());
        usuarioDto.setCiu(usuario.getCiudad());
        return usuarioDto; 
     }

     @Override
     public List<UsuarioDto> toUsuarioDtoList(List<Usuario> usuarios){
        if(usuarios == null || usuarios.isEmpty()){
            return List.of();
        }

        List<UsuarioDto> usuarioDtos = new ArrayList<UsuarioDto>(usuarios.size());
        for(Usuario usuario: usuarios){
        usuarioDtos.add(toUsuarioDto(usuario));
        }
        return usuarioDtos;
     }

     @Override
     public void userupdate(Usuario usuario, UsuarioDto usuarioDto){
        if(usuarioDto == null){
            return;
        }        
        usuario.setNombre(usuarioDto.getNom());
        usuario.setApellido(usuarioDto.getApe());
        usuario.setCiudad(usuarioDto.getCiu());
     }

     
}

