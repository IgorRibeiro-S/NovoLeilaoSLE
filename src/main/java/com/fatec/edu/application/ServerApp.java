package com.fatec.edu.application;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import com.fatec.edu.controller.ClienteResource;
import com.fatec.edu.controller.FinanceiraResource;
import com.fatec.edu.controller.ImovelResource;
import com.fatec.edu.controller.LeilaoResource;
import com.fatec.edu.controller.VeiculoResource;

public class ServerApp extends Application {

	@Override
	public synchronized Restlet createInboundRoot() {
		Router r = new Router(getContext());
		r.attach("/cliente", ClienteResource.class);
		r.attach("/leilao", LeilaoResource.class);
		r.attach("/financeira", FinanceiraResource.class);
		r.attach("/imovel", ImovelResource.class);
		r.attach("/veiculo", VeiculoResource.class);
		
		
		return r;
	}
}
