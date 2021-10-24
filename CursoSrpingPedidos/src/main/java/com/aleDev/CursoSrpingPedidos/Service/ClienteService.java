package com.aleDev.CursoSrpingPedidos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aleDev.CursoSrpingPedidos.Service.exception.ObjectNotFoundException;
import com.aleDev.CursoSrpingPedidos.entity.Cliente;
import com.aleDev.CursoSrpingPedidos.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable Long id) {
		Cliente cli = clienteRepository.findById(id).get();
		
		if(cli == null) {
			throw new ObjectNotFoundException("Objeto não encontrado Id:" + id
					+ ", Tipo: " + Cliente.class.getName());
		}
		
		return ResponseEntity.ok(cli);
	}

}
