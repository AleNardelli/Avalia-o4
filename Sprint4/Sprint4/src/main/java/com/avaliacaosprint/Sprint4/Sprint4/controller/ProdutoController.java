package com.avaliacaosprint.Sprint4.Sprint4.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacaosprint.Sprint4.Sprint4.modelo.Produto;
import com.avaliacaosprint.Sprint4.Sprint4.repository.ProdutoRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping("/produto")
	public List<Produto> findAll() {
	List<Produto> findAll = produtoRepository.findAll();
	return findAll();
	
	}
	
	@ApiOperation(value = "Post produto")
    @RequestMapping(value = "/produto", method =  RequestMethod.POST, produces="application/json", consumes="application/json")
    public Produto Post(@Valid @RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}
