package com.rcdesenvolvimento.Java.Web.Spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcdesenvolvimento.Java.Web.Spring.entities.Usuario;
import com.rcdesenvolvimento.Java.Web.Spring.repositories.UsuarioRepository;

//controlador rest = 
//objeto responsavel por receber as
//requisicoes do usuario e responder as mesmas

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	//composicao de componentes
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	//busca todos usuarios
	@GetMapping
	public List<Usuario> findAll(){
		List<Usuario> result = usuarioRepository.findAll();
		return result;
	}
	
	//busca por id
	@GetMapping(value = "/{id}")
	public Usuario findById(@PathVariable Long id){
		Usuario result = usuarioRepository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Usuario insert(@RequestBody Usuario usuario){
		Usuario result = usuarioRepository.save(usuario);
		return result;
	}

}
