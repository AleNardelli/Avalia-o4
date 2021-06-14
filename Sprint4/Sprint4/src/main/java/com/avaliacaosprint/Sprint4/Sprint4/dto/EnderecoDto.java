package com.avaliacaosprint.Sprint4.Sprint4.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.avaliacaosprint.Sprint4.Sprint4.modelo.Endereco;

public class EnderecoDto {
	
	private String cidade;
	private String rua;
	
	public EnderecoDto(Endereco endereco) {
		this.cidade = cidade;
		this.rua = rua;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public static List<EnderecoDto> converter(List<Endereco> endereco){
        return endereco.stream().map(EnderecoDto::new).collect(Collectors.toList());
	}
}
	


