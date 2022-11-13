package com.fatec.edu.repository;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fatec.edu.entities.Cliente;
import com.fatec.edu.entities.Lance;
import com.fatec.edu.entities.VeiculoSkate;
import com.fatec.edu.services.LanceService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class LanceRepository implements LanceService {
	
	
	private Set<Lance> lances = new HashSet<>();
	private Cliente cliente = new Cliente(12, "123456", "Jorge", "1231234", "123124", "jorge@gmail.com");
	private VeiculoSkate veiculo1 = new VeiculoSkate(44, "Veiculo","Bilabong", 2009, null, "Skate de qualidade", 50.00, null ,false, "Novo", 5.55 );

	Lance cli1 = new Lance(1,cliente, 160.95, LocalDate.now(),null, veiculo1 );
	

	@Override
	public Set<Lance> listarLances() {
		lances.add(cli1);
		return lances;
	}

	@Override
	public void novoLance(Lance lance) {
		lances.add(lance);
		lances.add(cli1);

	}

	@Override
	public void atualizarDados(Lance antigo, Lance novo) {
		antigo.setCliente(novo.getCliente());
		antigo.setImovel(novo.getImovel());
		antigo.setVeiculo(novo.getVeiculo());

	}

	@Override
	public void removerLance(Integer id) {
		for (Lance lance : listarLances()) {
			if (lance.getId() == id) {
				lances.remove(lance);
			}
		}

	}

	@Override
	public void atualizarLance(Integer id, Lance lance) {
		for (Lance obj : lances) {
			if (obj.getId() == id) {
				obj.setCliente(lance.getCliente());
				obj.setImovel(lance.getImovel());
				obj.setVeiculo(lance.getVeiculo());
				lances.add(lance);
			}
		}
	}
}
