package com.sena.clase2.mapper;

import java.util.List;

import com.sena.clase2.dto.UsuarioDto;
import com.sena.clase2.models.Usuario;

public interface UsuarioMapper {

    Usuario toUsuarios(UsuarioDto usuarioDto);

    UsuarioDto toUsuarioDto (Usuario usuario);

    List<UsuarioDto> toUsuarioDtoList(List<Usuario> usuarios);
        
}
