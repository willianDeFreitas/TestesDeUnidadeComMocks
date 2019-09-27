package com.example.ExeTesteUnitMockDiagramSeq;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class PedidoTests {
	
	private LinhaPedido linhaPedido;
	
	@Mock
	private Pedido pedido;
	
	@Mock
	private Cliente cliente;

	@Before
	public void initPedidoService() {
		MockitoAnnotations.initMocks(this);
		linhaPedido = new LinhaPedido(cliente, pedido);
	}
	
	@Test
	public void testaPedidosSemDesconto() {
		when(pedido.getCalcularPreco()).thenReturn(0.0);
		when(cliente.getValorPedidoComDesconto()).thenReturn(0.0);
		double valor = linhaPedido.valorComDesconto();
		Assert.assertEquals(valor, 0.0,0.1);
	}
}