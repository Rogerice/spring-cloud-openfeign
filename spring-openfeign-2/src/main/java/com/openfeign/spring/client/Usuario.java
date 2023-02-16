package com.openfeign.spring.client;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class Usuario {

	private String nome;
	private String email;
	private int idade;

}
