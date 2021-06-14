package com.avaliacaosprint.Sprint4.Sprint4.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Pedido {
	
	@ApiModelProperty(value = "Código pedido")
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@ApiModelProperty(value = "Quantidade")
	@NotNull
	@Column(name="quantidade")
	private double quantidade;
	
	@ApiModelProperty(value = "Total")
	@NotNull
	@Column(name="total")
	private double total;
	
	@ApiModelProperty(value = "LocalDateTime")
	@NotNull
	@Column(name="LocalDateTime")
	private LocalDateTime date;
	
	@ManyToMany
	private List<Produto> produtos;

	
	public Pedido() {
		this.date = LocalDateTime.now();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
		
		for (Produto produto :produtos) {
			this.total += produto.getPrecoUnitario();
		}
	}
	

}
