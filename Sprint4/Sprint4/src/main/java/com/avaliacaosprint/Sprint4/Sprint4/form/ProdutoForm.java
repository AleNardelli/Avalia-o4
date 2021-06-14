package com.avaliacaosprint.Sprint4.Sprint4.form;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.avaliacaosprint.Sprint4.Sprint4.modelo.Produto;
import com.avaliacaosprint.Sprint4.Sprint4.repository.ProdutoRepository;

public class ProdutoForm {
	
	@NotNull
	private String descricao;
	@NotNull
	private double precoUnitario;
	
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
	
	public Produto ToForm() {
		Produto produto = new Produto(null, descricao, precoUnitario);
		return produto;
	}

}
