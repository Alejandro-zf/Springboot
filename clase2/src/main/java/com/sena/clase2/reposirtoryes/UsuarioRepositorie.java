package com.sena.clase2.reposirtoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.clase2.models.Usuario;

public interface UsuarioRepositorie extends JpaRepository<Usuario,Integer> {

}
