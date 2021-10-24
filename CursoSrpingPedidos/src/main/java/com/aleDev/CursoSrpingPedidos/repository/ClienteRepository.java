package com.aleDev.CursoSrpingPedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aleDev.CursoSrpingPedidos.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
