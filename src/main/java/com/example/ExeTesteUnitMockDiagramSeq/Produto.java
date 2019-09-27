package com.example.ExeTesteUnitMockDiagramSeq;

public class Produto {
	
	private LinhaPedido linhaPedido;
	
	private double qtd;
	
	public double getPrecoFinal () {
		double vlrPedido = (qtd * linhaPedido.getPreco()); 
		return vlrPedido;
	}

}
