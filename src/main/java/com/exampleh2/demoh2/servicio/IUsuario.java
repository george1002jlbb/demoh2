package com.exampleh2.demoh2.servicio;

import com.exampleh2.demoh2.modelo.Usuario;

import java.util.ArrayList;
import java.util.Optional;

public interface IUsuario {

    Usuario guardar(Usuario usuario);
    Optional<Usuario> consultarUsuario(Long id);
    Usuario modificarUsuario(Usuario usuario);
    ArrayList<Usuario> listarUsuario();
    boolean eliminarUsuario(Long id);

}
