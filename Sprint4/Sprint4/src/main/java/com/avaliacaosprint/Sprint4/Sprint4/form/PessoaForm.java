package com.avaliacaosprint.Sprint4.Sprint4.form;

import java.util.List;

import com.avaliacaosprint.Sprint4.Sprint4.modelo.Endereco;
import com.avaliacaosprint.Sprint4.Sprint4.modelo.Pessoa;
import com.avaliacaosprint.Sprint4.Sprint4.repository.PessoaRepository;
import com.sun.istack.NotNull;



public class PessoaForm {
	
	@NotNull
	private String nome;
	@NotNull
	private String cpf;
	@NotNull
	private double salario;
	@NotNull
	private char sexo;
	@NotNull
	private List<Endereco> endereco;
	
	
	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
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
	
	public Pessoa converter() {
		return new Pessoa(this.nome, this.cpf, this.salario, this.sexo, this.endereco);
	}
	

}
