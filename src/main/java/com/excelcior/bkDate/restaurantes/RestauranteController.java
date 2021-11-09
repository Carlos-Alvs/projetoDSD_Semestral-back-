package com.excelcior.bkDate.restaurantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/restaurantes")
@AllArgsConstructor

public class RestauranteController {
	@Autowired
	RestauranteRepository repository;
	
	@GetMapping("/retornaTodos")
	List<Restaurante> todosRestaurantes(){
		return repository.findAll();
	}
	
	@PostMapping("/novo")
	Restaurante novoRestaurante(@RequestBody Restaurante restaurante) {
		return repository.save(restaurante);
	}
}
