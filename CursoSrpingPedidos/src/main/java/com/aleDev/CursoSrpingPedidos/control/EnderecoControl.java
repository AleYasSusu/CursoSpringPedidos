package com.aleDev.CursoSrpingPedidos.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aleDev.CursoSrpingPedidos.Service.EnderecoService;
import com.aleDev.CursoSrpingPedidos.entity.Endereco;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoControl {

	
	@Autowired
	private EnderecoService enderecoService;
	
	
	@GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long idEndereco) {
    	ResponseEntity<Endereco> end = enderecoService.findById(idEndereco);
        if (end != null) {
            return ResponseEntity.ok(end);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
