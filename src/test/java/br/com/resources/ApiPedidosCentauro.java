package br.com.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value ="/api/v1/pedidos")
public class ApiPedidosCentauro {

	@RequestMapping (value="/{pedido}", method =  RequestMethod.GET)
	public void apiConsultTest ( @PathVariable Long pedido ) {
		System.out.println("Tetando o recebimento do pedido:" + pedido );
	}
	
	
}
