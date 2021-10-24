package com.aleDev.CursoSrpingPedidos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.aleDev.CursoSrpingPedidos.entity.Pedido;
import com.aleDev.CursoSrpingPedidos.repository.PedidoRepository;

@Service
public class PedidoService {

	
	@Autowired
	private PedidoRepository pedidoRepository;


	@GetMapping(value = "/{id}")
	public ResponseEntity<Pedido> findById( Long id) {
		Pedido prod = pedidoRepository.findById(id).get();
		return ResponseEntity.ok(prod);
	}
}
