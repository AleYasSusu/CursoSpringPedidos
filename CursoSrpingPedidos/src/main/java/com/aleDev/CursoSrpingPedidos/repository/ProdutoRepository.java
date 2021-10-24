package com.aleDev.CursoSrpingPedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aleDev.CursoSrpingPedidos.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
