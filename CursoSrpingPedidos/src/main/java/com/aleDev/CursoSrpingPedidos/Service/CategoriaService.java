package com.aleDev.CursoSrpingPedidos.Service;

import org.springframework.http.ResponseEntity;

import com.aleDev.CursoSrpingPedidos.entity.Categoria;

public interface CategoriaService {
	 ResponseEntity<Categoria> findById(final Long Id);
}