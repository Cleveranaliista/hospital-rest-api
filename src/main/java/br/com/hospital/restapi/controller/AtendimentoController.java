package br.com.hospital.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hospital.restapi.dao.AtendimentoEntity;
import br.com.hospital.restapi.model.Atendimento;
import br.com.hospital.restapi.services.AtendimentoServices;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {

	private AtendimentoServices service;
	
	public AtendimentoController(AtendimentoServices service) {
		this.service = service;
	}
	
	@PostMapping
	public int saveAtendimento(@RequestBody Atendimento Atendimento) {
		AtendimentoEntity created = this.service.salvaAtendimento(Atendimento);
		
		return created.getCodAtendimento();
	}
	
	 @GetMapping("/{id}")
	 public AtendimentoEntity getAtendimento(@PathVariable int id) {
		 return this.service.getAtendimento(id);
	 }
	
}
