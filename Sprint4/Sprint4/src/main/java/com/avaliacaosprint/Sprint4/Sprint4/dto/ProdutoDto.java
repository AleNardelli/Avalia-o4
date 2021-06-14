package com.avaliacaosprint.Sprint4.Sprint4.dto;

public class ProdutoDto {
	
	private String descricao;
	private double precoUnitario;
	
	
	public ProdutoDto(String descricao, double precoUnitario) {
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	

}
