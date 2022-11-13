package com.fatec.edu.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fatec.edu.entities.Cliente;
import com.fatec.edu.entities.Financeira;
import com.fatec.edu.entities.Imovel;
import com.fatec.edu.entities.ImovelCasa;
import com.fatec.edu.entities.Leilao;
import com.fatec.edu.entities.Veiculo;
import com.fatec.edu.entities.VeiculoSkate;
import com.fatec.edu.services.LeilaoService;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class LeilaoRepository implements LeilaoService {

	private Set<Leilao> leilaos = new HashSet<>();
	private Cliente cliente = new Cliente(12, "123456", "Jorge", "1231234", "123124", "jorge@gmail.com");
	private VeiculoSkate veiculo1 = new VeiculoSkate(44, "Veiculo", "Bilabong", 2009, null, "Skate de qualidade", 50.00,
			null, false, "Novo", 5.55);
	private ImovelCasa imovel1 = new ImovelCasa(53, "344hc", "Casa", "Rua das colméias 44", "Casa nova", 200000.00,
			null, 6, true, 125.44);
	private Financeira finan1 = new Financeira(78, "123124", "Banco Bradesco", "BRADESCO", "Conta corrente", null);

	private List<Imovel> listImovel = new ArrayList<>();
	private List<Veiculo> listVeiculo = new ArrayList<>();
	private List<Financeira> listFinanceira = new ArrayList<>();

	Leilao cli1 = new Leilao(3, "SP", "EM ABERTO", "Sao Jose dos Campos", "Rua das andorinhas", LocalDate.now(),
			listImovel, listVeiculo, listFinanceira);

	@Override
	public Set<Leilao> listarLeilaos() {
		listImovel.add(imovel1);
		listVeiculo.add(veiculo1);
		listFinanceira.add(finan1);

		leilaos.add(cli1);
		return leilaos;
	}

	@Override
	public void novoLeilao(Leilao leilao) {
		listImovel.add(imovel1);
		listVeiculo.add(veiculo1);
		listFinanceira.add(finan1);
		leilaos.add(leilao);
		leilaos.add(cli1);

	}

	@Override
	public void atualizarDados(Leilao antigo, Leilao novo) {
		antigo.setCidade(novo.getCidade());
		antigo.setEndereco(novo.getEndereco());
		antigo.setEstado(novo.getEstado());
		antigo.setStatus(novo.getStatus());

	}

	@Override
	public void removerLeilao(Integer id) {
		for (Leilao leilao : listarLeilaos()) {
			if (leilao.getId() == id) {
				leilaos.remove(leilao);
			}
		}

	}

	@Override
	public void atualizarLeilao(Integer id, Leilao leilao) {
		LocalDateTime now = LocalDateTime.now();
		for (Leilao obj : leilaos) {
			if (obj.getId() == id) {
				if (obj.getData().getDayOfMonth() == now.getDayOfMonth()) {
					obj.setStatus("EM ANDAMENTO");
				} else {
					obj.setStatus("FINALIZADO");
				}
				leilaos.add(obj);
			}

		}
	}
}