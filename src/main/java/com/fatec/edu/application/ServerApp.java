package com.fatec.edu.application;

import com.fatec.edu.controller.ClienteResource;
import com.fatec.edu.controller.FinanceiraResource;
import com.fatec.edu.controller.ImovelDescricaoResource;
import com.fatec.edu.controller.ImovelResource;
import com.fatec.edu.controller.ImovelTipoResource;
import com.fatec.edu.controller.ImovelValoresResource;
import com.fatec.edu.controller.LanceResource;
import com.fatec.edu.controller.LeilaoResource;
import com.fatec.edu.controller.VeiculoDescricaoResource;
import com.fatec.edu.controller.VeiculoResource;
import com.fatec.edu.controller.VeiculoTipoResource;
import com.fatec.edu.controller.VeiculoValoresResource;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class ServerApp extends Application {

	@Override
	public synchronized Restlet createInboundRoot() {
		Router r = new Router(getContext());
		r.attach("/cliente", ClienteResource.class);
		r.attach("/leilao", LeilaoResource.class);
		r.attach("/financeira", FinanceiraResource.class);
		r.attach("/imovel", ImovelResource.class);
		r.attach("/veiculo", VeiculoResource.class);
		//attachSwaggerSpecificationRestlet(r, "/docs");
		r.attach("/lance", LanceResource.class);
		r.attach("/imovel/{tipo}", ImovelTipoResource.class);
		r.attach("/imovel/valores/{valor}", ImovelValoresResource.class);
		r.attach("/imovel/descricao/{palavra}", ImovelDescricaoResource.class);
		r.attach("/veiculo/{tipo}", VeiculoTipoResource.class);
		r.attach("/veiculo/valores/{valor}", VeiculoValoresResource.class);
		r.attach("/veiculo/descricao/{palavra}", VeiculoDescricaoResource.class);
		return r;
	}

}
