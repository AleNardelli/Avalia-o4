package com.avaliacaosprint.Sprint4.Sprint4.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;

import com.avaliacaosprint.Sprint4.Sprint4.form.PessoaForm;
import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Pessoa {
	
	@ApiModelProperty(value = "Código pessoa")
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@ApiModelProperty(value = "Nome")
	@NotNull
	@Column(name="nome")
	private String nome;
	
	@ApiModelProperty(value = "Cpf")
	@NotNull
	@Column(name="cpf")
	private String cpf;
	
	@ApiModelProperty(value = "Salário")
	@NotNull
	@Column(name="salario")
	private double salario;
	
	@ApiModelProperty(value = "Sexo")
	@NotNull
	@Column(name="sexo")
	private char sexo;
	
	@NotNull
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_pessoa")
	private List<Endereco> endereco;
	
	
	public Pessoa(String nome, String cpf, double salario, char sexo, List<Endereco> endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.sexo = sexo;
		this.endereco = endereco;
	}
	 
	public Pessoa() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
	

}
