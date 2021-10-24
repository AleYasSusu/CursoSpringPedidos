package com.aleDev.CursoSrpingPedidos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aleDev.CursoSrpingPedidos.Service.ProdutoService;
import com.aleDev.CursoSrpingPedidos.entity.Produto;
import com.aleDev.CursoSrpingPedidos.repository.ProdutoRepository;

@Service
public class ProdutoService  {

	
	
	@Autowired
	private ProdutoRepository produtoRepository;


	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> findById( Long id) {
		Produto obj = produtoRepository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}
