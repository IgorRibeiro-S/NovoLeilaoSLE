package com.fatec.edu.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Setter
public class Cliente {

	private Integer id;
	private String cpf;
	private String nome;
	private String telefone;
	private String cep;
	private String email;

}
