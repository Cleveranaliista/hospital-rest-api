package br.com.hospital.restapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import br.com.hospital.restapi.services.PacienteService;
import br.com.hospital.restapi.model.Paciente;
import br.com.hospital.restapi.dao.PacienteEntity;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	private PacienteService service;
	
	public PacienteController(PacienteService service) {
		this.service = service;
	}
	
	@PostMapping
	public int savePaciente(@RequestBody Paciente Paciente) {
		PacienteEntity created = this.service.salvaPaciente(Paciente);
		
		return created.getCodPaciente();
	}
	
	 @GetMapping("/{id}")
	 public PacienteEntity getPaciente(@PathVariable int id) {
		 return this.service.getPaciente(id);
	 }
	
}
