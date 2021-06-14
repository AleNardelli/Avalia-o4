package com.avaliacaosprint.Sprint4.Sprint4.form;

import java.util.List;

import com.avaliacaosprint.Sprint4.Sprint4.modelo.Endereco;
import com.avaliacaosprint.Sprint4.Sprint4.repository.EnderecoRepository;
import com.sun.istack.NotNull;

public class EnderecoForm {
	
	@NotNull
	private String pais;
	@NotNull
	private String estado;
	@NotNull
	private String cidade;
	@NotNull
	private String cep;
	@NotNull
	private String rua;
	
	
	
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


	public List<Endereco> converter(EnderecoRepository enderecorepository) {
		return enderecorepository.findAll();
	}

}


