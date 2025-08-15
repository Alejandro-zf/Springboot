package com.sena.clase2.mapper;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.sena.clase2.dto.ProductoDto;
import com.sena.clase2.models.Productos;

@Component
public class ProductoMapperimplement implements ProductoMapper{

    @Override
    public Productos toProducto(ProductoDto productoDto){
        if(productoDto == null){
            return null;
        }

        Productos productos = new Productos();
        productos.setId_producto(productoDto.getIdd());
        productos.setNombre(productoDto.getNombr());
        productos.setPrecio(productoDto.getPrec());
        productos.setCategoria(productoDto.getCateg());
        return productos;
    }

    @Override
    public ProductoDto toProductoDto(Productos productos){
        if(productos == null)
        return null;
    

    ProductoDto productoDto = new ProductoDto();
    productoDto.setIdd(productos.getId_producto());
    productoDto.setNombr(productos.getNombre());
    productoDto.setPrec(productos.getPrecio());
    productoDto.setCateg(productos.getCategoria());
    return productoDto;        
    }

    @Override
    public List<ProductoDto> toProductoLists (List<Productos> productos){
        if (productos == null || productos.isEmpty()) {
            return List.of();
        }
    List<ProductoDto> productoDtos = new ArrayList<ProductoDto>(productos.size());
    for(Productos producto:productos){
        productoDtos.add(toProductoDto(producto));
    }
    return productoDtos;
    }

    
}
