package com.avaliacaosprint.Sprint4.Sprint4.dto;

public class PedidoDto {
	
	private double quantidade;
	private double total;
	
	public PedidoDto(Double quantidade, double total) {
		super();
		this.quantidade = quantidade;
		this.total = total;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	

}
