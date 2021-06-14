package com.avaliacaosprint.Sprint4.Sprint4.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacaosprint.Sprint4.Sprint4.dto.PessoaDto;
import com.avaliacaosprint.Sprint4.Sprint4.modelo.Pessoa;
import com.avaliacaosprint.Sprint4.Sprint4.repository.PessoaRepository;

import org.springframework.web.util.UriComponentsBuilder;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping("/pessoa")
	public List<Pessoa> findAll() {
		List<Pessoa> findAll = pessoaRepository.findAll();
		return findAll();
		
	}
	
	@ApiOperation(value = "Post uma pessoa")
    @RequestMapping(value = "/pessoa", method =  RequestMethod.POST, produces="application/json", consumes="application/json")
    public Pessoa Post(@Valid @RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

}
