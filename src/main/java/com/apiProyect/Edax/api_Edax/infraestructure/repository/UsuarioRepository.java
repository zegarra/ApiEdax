package com.apiProyect.Edax.api_Edax.infraestructure.repository;

import com.apiProyect.Edax.api_Edax.domian.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
    public Usuario findByNomUsuario(String nomUsuario);

}
