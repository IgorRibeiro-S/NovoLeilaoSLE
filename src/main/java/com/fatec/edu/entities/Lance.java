package com.fatec.edu.entities;

import java.time.LocalDate;

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
public class Lance {
	
	private Integer id;
	private Cliente cliente;
	private Double valor;
	private LocalDate data;
	private Imovel imovel;
	private Veiculo veiculo;

}
