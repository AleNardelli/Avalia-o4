package com.avaliacaosprint.Sprint4.Sprint4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avaliacaosprint.Sprint4.Sprint4.modelo.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
