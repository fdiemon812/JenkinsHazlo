package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Pedido;
import com.example.demo.service.PedidoService;

@SpringBootTest
class BuenoSpringApplicationTests {

	@Autowired
	private PedidoService pedidoService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void prueba() {
		Pedido pedido = new Pedido();
		pedidoService.addPedido(1, pedido, 1);
		assertEquals(20.0, pedidoService.calculaPrecioTotal(pedido));
		
	}

	
	@Test
	void pruebaFallo() {
		Pedido pedido = new Pedido();
		pedidoService.addPedido(1, pedido, 1);
		assertEquals(100.0, pedidoService.calculaPrecioTotal(pedido));
		
	}
	
	
}
