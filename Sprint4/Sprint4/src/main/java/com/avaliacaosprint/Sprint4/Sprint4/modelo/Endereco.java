package com.avaliacaosprint.Sprint4.Sprint4.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Endereco {
	
	@ApiModelProperty(value = "Código endereco")
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@ApiModelProperty(value = "Pais")
	@NotNull
	@Column(name="pais")
	private String pais;
	
	@ApiModelProperty(value = "Estado")
	@NotNull
	@Column(name="estado")
	private String estado;
	
	@ApiModelProperty(value = "Cidade")
	@NotNull
	@Column(name="cidade")
	private String cidade;
	
	@ApiModelProperty(value = "Cep")
	@NotNull
	@Column(name="cep")
	private String cep;
	
	@ApiModelProperty(value = "Rua")
	@NotNull
	@Column(name="rua")
	private String rua;
	
	@ManyToOne
	private Pessoa pessoa;
	
	public Endereco(String pais, String estado, String cidade, String cep, String rua) {
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.cep = cep;
		this.rua = rua;
	}
	
	public Endereco() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	

}
