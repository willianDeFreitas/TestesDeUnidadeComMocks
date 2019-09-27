package com.example.ExeTesteUnitMockDiagramSeq;

public class LinhaPedido {
		
		private Pedido pedido;
		private Cliente cliente;
		private double preco;
		
		public LinhaPedido(Cliente cliente, Pedido pedido) {
			super();
			this.cliente = cliente;
			this.pedido = pedido;
		}
		
		public double getPreco() {
			return preco = pedido.getCalcularPreco();
		}
		
		public double valorComDesconto() {
			return cliente.getValorPedidoComDesconto();
		}

}
