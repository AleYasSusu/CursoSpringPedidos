package com.aleDev.CursoSrpingPedidos.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aleDev.CursoSrpingPedidos.Service.ClienteService;
import com.aleDev.CursoSrpingPedidos.entity.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteControl {
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long idCliente) {
    	ResponseEntity<Cliente> cli = clienteService.findById(idCliente);
        if (cli != null) {
            return ResponseEntity.ok(cli);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
