package com.fatec.edu.repository;

import java.util.HashSet;
import java.util.Set;

import com.fatec.edu.entities.Veiculo;
import com.fatec.edu.entities.VeiculoCarro;
import com.fatec.edu.entities.VeiculoSkate;
import com.fatec.edu.services.VeiculoService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class VeiculoRepository implements VeiculoService {

	private Set<Veiculo> veiculos = new HashSet<>();

	private VeiculoSkate veiculo1 = new VeiculoSkate(44, "Veiculo", "Bilabong", 2009, null, "Skate de qualidade", 50.00,
			null, false, "Novo", 5.55);

	private VeiculoCarro veiculo2 = new VeiculoCarro(19, "Veiculo", "Nissan", 2012, "Versa", "Carro Semi novo", 48000.00,
			null, true, "Prata",2021, "APROVADO");
	
	@Override
	public Set<Veiculo> listarVeiculos() {
		veiculos.add(veiculo1);
		veiculos.add(veiculo2);
		return veiculos;
	}

	@Override
	public void novoVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
		veiculos.add(veiculo1);
		veiculos.add(veiculo2);

	}

	@Override
	public void atualizarDados(Veiculo obj, Veiculo veiculo) {
		obj.setDescricao(veiculo.getDescricao());
		obj.setTipo(veiculo.getTipo());
		obj.setValor(veiculo.getValor());

	}

	@Override
	public void removerVeiculo(Integer id) {
		for (Veiculo veiculo : listarVeiculos()) {
			if (veiculo.getId() == id) {
				veiculos.remove(veiculo);
			}
		}

	}

	@Override
	public void atualizarVeiculo(Integer id, Veiculo veiculo) {
		for (Veiculo obj : veiculos) {
			if (obj.getId() == id) {
				obj.setDescricao(veiculo.getDescricao());
				obj.setTipo(veiculo.getTipo());
				obj.setValor(veiculo.getValor());
				veiculos.add(veiculo);
			}
		}
	}

}
