package com.avaliacaosprint.Sprint4.Sprint4.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacaosprint.Sprint4.Sprint4.modelo.Endereco;
import com.avaliacaosprint.Sprint4.Sprint4.repository.EnderecoRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@GetMapping("/endereco")
	public List<Endereco> findAll() {
		List<Endereco> findAll = enderecoRepository.findAll();
		return findAll();
		
	}
	
	@ApiOperation(value = "Post endereço")
    @RequestMapping(value = "/endereco", method =  RequestMethod.POST, produces="application/json", consumes="application/json")
    public Endereco Post(@Valid @RequestBody Endereco endereco){
        return enderecoRepository.save(endereco);
    }

}
