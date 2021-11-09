package com.excelcior.bkDate.contatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/contatos")
@AllArgsConstructor
public class ContatoController {
	@Autowired
	ContatoRepository repository;
	
	@GetMapping("/retornaTodos")
	List<Contato> todosContatos(){
		return repository.findAll();
	}
	@PostMapping("/novo")
	Contato novoContato(@RequestBody Contato contato) {
		return repository.save(contato);
	}
	
	

}
