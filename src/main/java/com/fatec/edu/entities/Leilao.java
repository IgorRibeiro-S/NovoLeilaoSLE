package com.fatec.edu.entities;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
@Entity
public class Leilao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant dataLeilao;
	private String estado;
	private String cidade;
	private String endereco;
	private LocalDate data;
	
	@OneToMany(mappedBy = "leilao")
	private List<Imovel> imoveis;

	@OneToMany(mappedBy = "leilao")
	private List<Veiculo> veiculos;
	
	@OneToMany(mappedBy = "leilao")
	private List<Financeira> financeira;
	
}
