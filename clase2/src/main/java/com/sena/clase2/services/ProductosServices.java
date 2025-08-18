package com.sena.clase2.services;

import java.util.List;

import com.sena.clase2.dto.ProductoDto;

public interface ProductosServices {

    public ProductoDto getProducto(Integer productoid);

    public ProductoDto saveProducto(ProductoDto ProductoDto);

    public List<ProductoDto> getProductos();

    public ProductoDto deleteProducto(Integer productoid);

    public ProductoDto updateProducto(Integer productoid, ProductoDto productoDto);
}
