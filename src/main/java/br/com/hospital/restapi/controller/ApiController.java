package br.com.hospital.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.hospital.restapi.model.Pessoa;
import br.com.hospital.restapi.services.PessoaServices;

@RestController
public class ApiController {
	
	@Autowired
	private static PessoaServices pessoaService;
	
	@SuppressWarnings("static-access")
	@GetMapping("/pessoas/")
	public List<Pessoa> pessoas(){
		return pessoaService.listaDePessoas();
	}

	@GetMapping("/pessoa/{id}/")
	public Pessoa pessoaId(@PathVariable Integer id){
		return PessoaServices.getPessoaPorId(id);
	}
	
}
