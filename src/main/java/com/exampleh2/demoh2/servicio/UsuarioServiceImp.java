package com.exampleh2.demoh2.servicio;

import com.exampleh2.demoh2.modelo.Usuario;
import com.exampleh2.demoh2.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioServiceImp implements IUsuario{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario guardar(Usuario usuario){
        return (Usuario) usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> consultarUsuario(Long id){
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario modificarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @Override
    public ArrayList<Usuario> listarUsuario(){
        return (ArrayList<Usuario>)usuarioRepository.findAll();
    }

    @Override
    public boolean eliminarUsuario(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch (Exception error){
            return false;
        }
    }

}
