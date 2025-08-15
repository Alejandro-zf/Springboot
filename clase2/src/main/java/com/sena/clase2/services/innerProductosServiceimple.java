package com.sena.clase2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.clase2.dto.ProductoDto;
import com.sena.clase2.mapper.ProductoMapper;
import com.sena.clase2.models.Productos;
import com.sena.clase2.reposirtoryes.ProductoRepositorie;

@Service
public class innerProductosServiceimple implements ProductosServices {

    @Autowired
    private ProductoRepositorie produRepo;

    @Autowired
    private ProductoMapper produMapper;

    @Override
    public ProductoDto getProducto(Integer productoid){
    Productos productos = produRepo.findById(productoid).get();
    return produMapper.toProductoDto(productos);
    }

    @Override
    public ProductoDto saveProducto(ProductoDto productoDto){
        Productos productos = produMapper.toProducto(productoDto);
        return produMapper.toProductoDto(produRepo.save(productos));        
    }

    @Override
    public List<ProductoDto> getProductos (){
        List<Productos> productos = produRepo.findAll();
        return produMapper.toProductoLists(productos);
    }

    @Override
    public ProductoDto deleteProducto(Integer productoid){
        Productos productos = produRepo.findById(productoid).get();
        produRepo.delete(productos);
        return produMapper.toProductoDto(productos);
    }

}
