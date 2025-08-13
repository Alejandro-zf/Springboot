package com.sena.clase2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sena.clase2.dto.UsuarioDto;
import com.sena.clase2.models.Usuario;
import com.sena.clase2.reposirtoryes.UsuarioRepositorie;
import com.sena.clase2.services.UsuarioServices;

import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class UsuarioController {
    
    @Autowired
    private UsuarioRepositorie userRepo;
    
    @GetMapping ("/usa")
    public String usuarios (){
        return new String("Conectando desde el controlador usuarios");
    }

    @GetMapping ("/users")
    public String listaUsuarios (){
    return userRepo.findAll().toString();
    }
    
    @GetMapping("/listausuarios")
    public List <Usuario> Usuarioslista() {
    return userRepo.findAll();
}
    @PostMapping("/agregarusuarios")
    public String crearusuario(@RequestBody Usuario usuario) {
         userRepo.save(usuario);
         return "El usuario ha sido creado";
    }

    @DeleteMapping("/users/{id}")
    public String eliminarusuario(@PathVariable Integer id){
        userRepo.deleteById(id);
        return "Usuario eliminado";
    }


    @PutMapping("Usuario/{id}")
    public String userupdate(@PathVariable String id, @RequestBody Usuario usuario) {
        Usuario userupdate = userRepo.findById(Integer.parseInt(id)).orElse(null);
        if(userupdate==null){
        return "Usuario no encontrado";
        }
        userupdate.setNombre(usuario.getNombre());
        userupdate.setApellido(usuario.getApellido());
        userupdate.setCiudad(usuario.getCiudad());
        userRepo.save(userupdate);
        return "Usuario actualizado";
    }

    //Metodos mediante arquitecturas de capas

    @Autowired
    private UsuarioServices usersServices;

    @GetMapping("/userser/{id}")
    public ResponseEntity<UsuarioDto> getUsuario(@PathVariable Integer id) {
        return new ResponseEntity<>(usersServices.getUsuario(id),HttpStatus.OK);
    }

}
