package com.sena.clase2.reposirtoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.clase2.models.Productos;

public interface ProductoRepositorie extends JpaRepository<Productos,Integer> {

}
