package com.aleDev.CursoSrpingPedidos.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aleDev.CursoSrpingPedidos.Service.impl.CategoriaServiceImpl;
import com.aleDev.CursoSrpingPedidos.entity.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategotiaControl {

	@Autowired
	private CategoriaServiceImpl categoriaServiceImpl;
	
	@GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long idCategoria) {
    	ResponseEntity<Categoria> cat = categoriaServiceImpl.findById(idCategoria);
        if (cat != null) {
            return ResponseEntity.ok(cat);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
