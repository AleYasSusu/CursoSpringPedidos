package com.aleDev.CursoSrpingPedidos.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aleDev.CursoSrpingPedidos.Service.ProdutoService;
import com.aleDev.CursoSrpingPedidos.entity.Categoria;
import com.aleDev.CursoSrpingPedidos.entity.Produto;
@RestController
@RequestMapping(value = "/Produtos")
public class ProdutoControl {

	
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long idproduto) {
    	ResponseEntity<Produto> prod = produtoService.findById(idproduto);
        if (prod != null) {
            return ResponseEntity.ok(prod);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
