package com.avaliacaosprint.Sprint4.Sprint4.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.avaliacaosprint.Sprint4.Sprint4.modelo.Pessoa;

public class PessoaDto {
	
	private String nome;
	private String cpf;

	
	public PessoaDto(Pessoa pessoa) {
		this.nome = nome;
		this.cpf = cpf;
	}
	

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	
	
	public static List<PessoaDto> converter(List<Pessoa> pessoa){
		return pessoa.stream().map(PessoaDto::new).collect(Collectors.toList());
		
	}

}
