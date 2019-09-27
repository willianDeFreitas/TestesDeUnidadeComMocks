package com.example.ExeTesteUnitMockDiagramSeq;

public class Cliente {
	
	private Produto produto;
	private double desconto;
	
	public Double getValorPedidoComDesconto() {
		double valorPedido = produto.getPrecoFinal();
		return valorPedido - (valorPedido * desconto/ 100d);
	}

}
