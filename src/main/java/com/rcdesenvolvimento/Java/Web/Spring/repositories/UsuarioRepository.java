package com.rcdesenvolvimento.Java.Web.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcdesenvolvimento.Java.Web.Spring.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
