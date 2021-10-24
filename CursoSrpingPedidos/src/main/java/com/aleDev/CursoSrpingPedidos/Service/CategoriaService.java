package com.aleDev.CursoSrpingPedidos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aleDev.CursoSrpingPedidos.Service.exception.ObjectNotFoundException;
import com.aleDev.CursoSrpingPedidos.entity.Categoria;
import com.aleDev.CursoSrpingPedidos.repository.CategoriaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public  class CategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Categoria obj = categoriaRepository.findById(id).get();
		
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado Id:" + id
					+ ", Tipo: " + Categoria.class.getName());
		}
		
		return ResponseEntity.ok(obj);
	}


	}
	


