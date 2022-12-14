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
public abstract class Imovel {
	
	private Integer id;
	private String registro;
	private String tipo;
	private String endereco;
	private String descricao;
	private Double valor;
	

	private Leilao leilao;

}
