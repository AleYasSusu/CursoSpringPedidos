package com.aleDev.CursoSrpingPedidos.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aleDev.CursoSrpingPedidos.Service.ProdutoService;
import com.aleDev.CursoSrpingPedidos.entity.Categoria;
import com.aleDev.CursoSrpingPedidos.entity.Produto;

public class ProdutoControl {

	
	
	@Autowired
	private ProdutoService produtoServiceImpl;
	
	@GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long idproduto) {
    	ResponseEntity<Produto> prod = produtoServiceImpl.findById(idproduto);
        if (prod != null) {
            return ResponseEntity.ok(prod);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
