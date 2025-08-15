package com.sena.clase2.services;

import java.util.List;

import com.sena.clase2.dto.UsuarioDto;
import com.sena.clase2.models.Usuario;

public interface UsuarioServices {

    public UsuarioDto getUsuario(Integer usuarioid);
    
    public UsuarioDto saveUsuario(UsuarioDto usuarioDto);

    public List<UsuarioDto> getUsuarios();

    public UsuarioDto  deleteUsuario (Integer usuarioid);
    
    public UsuarioDto updateUser (Integer usuarioid, UsuarioDto usuarioDto);
}
