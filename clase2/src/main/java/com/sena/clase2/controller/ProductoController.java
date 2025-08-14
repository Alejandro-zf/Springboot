package com.sena.clase2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sena.clase2.models.Productos;
import com.sena.clase2.reposirtoryes.ProductoRepositorie;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class ProductoController {
    @Autowired
    private ProductoRepositorie produRepo;

    @GetMapping("/Produ")
    public String productos () {
        return new String("Conectando desde el controlador");
    }
    
    @GetMapping("/Productos")
    public String listadeproductos () {
    return produRepo.findAll().toString();
    }

    @GetMapping("/listadeproductos")
    public List <Productos> ProductoLista() {
        return produRepo.findAll();
    }
    @PostMapping("/agregarproductos")
    public String crearproductos(@RequestBody Productos producto) {
        produRepo.save(producto);
        return "El producto a sido creado";
    }
    @DeleteMapping("/produ/{id}")
    public String eliminarproducto (@PathVariable Integer id){
        produRepo.deleteById(id);
        return "El producto ha sido eliminado";
    }
    @PutMapping("Producto/{id}")
    public String produupdate(@PathVariable String id, @RequestBody Productos producto) {
        Productos produupdate = produRepo.findById(Integer.parseInt(id)).orElse(null);
        if(produupdate == null){
            return "Producto no encontrado";
        }
        produupdate.setNombre(producto.getNombre());
        produupdate.setCategoria(producto.getCategoria());
        produupdate.setPrecio(producto.getPrecio());
        produRepo.save(produupdate);
        return "Datos del producto han sido actualizados";

    }
}
