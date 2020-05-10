package br.inatel.dm112.client;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import br.inatel.dm112.interfaces.Entregador;
import br.inatel.dm112.model.MailStatusResponse;
import br.inatel.dm112.model.OrderResponse;
import br.inatel.dm112.model.entities.EntregadorEntity;

public class PedidoClient {
	
	// local
	private String restURL = "https://fresh-office-275314.uc.r.appspot.com/api/";
	
	public OrderResponse searchOrder(String orderNumber) {

		String url = restURL + "order/" + orderNumber;
		
		return WebClient
				.create(url)
		        .get()
		        .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
		        .accept(MediaType.APPLICATION_JSON)
		        .retrieve()
		        .bodyToFlux(OrderResponse.class)
		        .log()
		        .blockFirst();
	}

}
