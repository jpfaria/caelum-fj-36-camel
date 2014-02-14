package br.com.caelum.camel;

import org.apache.camel.Exchange;

public class ValidadorPedido {

	public void validar(Exchange exchange) {
		System.out.println("Validando: " + exchange.getExchangeId());
		String xml = exchange.getIn().getBody(String.class);
		
		if (!xml.contains("<pagamento>")) {
			throw new RuntimeException("Sem pagamento no pedido");
		}
	}
	
}
