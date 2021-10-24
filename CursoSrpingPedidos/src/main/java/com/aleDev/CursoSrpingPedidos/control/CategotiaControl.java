package com.aleDev.CursoSrpingPedidos.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aleDev.CursoSrpingPedidos.Service.CategoriaService;
import com.aleDev.CursoSrpingPedidos.entity.Categoria;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/categorias")
public class CategotiaControl {

	@Autowired
	private CategoriaService categoriaService;
	
	
	@GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long idCategoria) {
    	ResponseEntity<Categoria> cat = categoriaService.findById(idCategoria);
        if (cat != null) {
            return ResponseEntity.ok(cat);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
