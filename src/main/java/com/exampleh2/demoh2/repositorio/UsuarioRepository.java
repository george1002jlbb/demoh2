package com.exampleh2.demoh2.repositorio;

import com.exampleh2.demoh2.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
