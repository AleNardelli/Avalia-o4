package com.avaliacaosprint.Sprint4.Sprint4.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacaosprint.Sprint4.Sprint4.modelo.Pedido;
import com.avaliacaosprint.Sprint4.Sprint4.repository.PedidoRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("/pedidos")
	public List<PedidoController> findAll() {
		List<Pedido> findAll = pedidoRepository.findAll();
		return findAll();
		
	}
	
	@ApiOperation(value = "Post pedido")
    @RequestMapping(value = "/pedido", method =  RequestMethod.POST, produces="application/json", consumes="application/json")
    public Pedido Post(@Valid @RequestBody Pedido pedido){
        return pedidoRepository.save(pedido);
    }
	

}
