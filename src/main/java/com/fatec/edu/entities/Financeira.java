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
@Getter
@Setter
@AllArgsConstructor

public class Financeira {

	private Integer id;
	private String cnpj;
	private String nome;
	private String agencia;
	private String conta;

	private Leilao leilao;
}
