package com.sena.clase2.mapper;

import java.util.List;

import com.sena.clase2.dto.ProductoDto;
import com.sena.clase2.models.Productos;

public interface ProductoMapper {

    Productos toProducto(ProductoDto productoDto);

    ProductoDto toProductoDto(Productos producto);
    
    List <ProductoDto>  toProductoLists(List<Productos> productos);

}
