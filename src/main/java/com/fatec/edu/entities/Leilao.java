package com.fatec.edu.entities;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

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

public class Leilao {

	private Integer id;
	private Instant dataLeilao;
	private String estado;
	private String cidade;
	private String endereco;
	private LocalDate data;
	private String status;

	private List<Imovel> imoveis;

	private List<Veiculo> veiculos;

	private List<Financeira> financeira;

	public Leilao(Integer id, String estado, String status,  String cidade, String endereco, LocalDate data, List<Imovel> imoveis,
			List<Veiculo> veiculos, List<Financeira> financeira) {
		super();
		this.id = id;
		this.dataLeilao = Instant.now();
		this.estado = estado;
		this.cidade = cidade;
		this.endereco = endereco;
		this.data = data;
		this.status = status;
		this.imoveis = imoveis;
		this.veiculos = veiculos;
		this.financeira = financeira;
	}
}
