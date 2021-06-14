package com.avaliacaosprint.Sprint4.Sprint4.form;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.avaliacaosprint.Sprint4.Sprint4.modelo.Pedido;
import com.avaliacaosprint.Sprint4.Sprint4.repository.PedidoRepository;


public class PedidoForm {
	
	@NotNull
	private double quantidade;
	@NotNull
	private double total;
	
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
	
	public List<Pedido> converter(PedidoRepository pedidorepository) {
		return pedidorepository.findAll();
	}

}
