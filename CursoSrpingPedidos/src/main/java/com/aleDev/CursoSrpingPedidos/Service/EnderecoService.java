package com.aleDev.CursoSrpingPedidos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aleDev.CursoSrpingPedidos.Service.exception.ObjectNotFoundException;
import com.aleDev.CursoSrpingPedidos.entity.Endereco;
import com.aleDev.CursoSrpingPedidos.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Endereco> findById(@PathVariable Long id) {
		Endereco end = enderecoRepository.findById(id).get();
		
		if(end == null) {
			throw new ObjectNotFoundException("Objeto não encontrado Id:" + id
					+ ", Tipo: " + Endereco.class.getName());
		}
		
		return ResponseEntity.ok(end);
	}
}
