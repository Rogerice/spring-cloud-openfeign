package com.openfeign.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openfeign.spring.client.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@GetMapping
	public Usuario getUsuario() {
		return Usuario.builder()
				.nome("Rogerio Rodrigues")
				.email("rogerrodriguesti@gmail.com")
				.idade(37).build();
	}

}
