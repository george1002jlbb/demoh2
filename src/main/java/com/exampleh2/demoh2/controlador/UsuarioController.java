package com.exampleh2.demoh2.controlador;

import com.exampleh2.demoh2.modelo.Usuario;
import com.exampleh2.demoh2.servicio.UsuarioServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    // clase controladora
    @Autowired
    private UsuarioServiceImp usuarioServiceImp;

    @PostMapping
    public ResponseEntity guardar(@RequestBody Usuario usuario){
        return new ResponseEntity(usuarioServiceImp.guardar(usuario), HttpStatus.CREATED);
    }

    @GetMapping( path = "/{id}")
    public ResponseEntity consutlarUsuario(@PathVariable("id") Long id){
        return new ResponseEntity(usuarioServiceImp.consultarUsuario(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity listarUsuario(){
        return new ResponseEntity(usuarioServiceImp.listarUsuario(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity modificarUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity(usuarioServiceImp.modificarUsuario(usuario), HttpStatus.OK);
    }

    @DeleteMapping( path = "/{id}")
    public ResponseEntity eliminarUsuario(@PathVariable("id") Long id){
        boolean response = usuarioServiceImp.eliminarUsuario(id);
        if (response == true){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
