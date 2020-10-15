package br.com.hospital.restapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hospital.restapi.dao.PacienteEntity;
import br.com.hospital.restapi.repository.PacienteRepository;
import br.com.hospital.restapi.model.Pessoa;
import br.com.hospital.restapi.model.Paciente;

@Service
public class PacienteService {

	private PacienteRepository repository;
	
	@Autowired
	public PacienteService(PacienteRepository repository) {
		this.repository = repository;
	}
	
	public PacienteEntity salvaPaciente(Paciente Paciente) {
		PacienteEntity entidade = new PacienteEntity();
		
		entidade.setCodPaciente(2);
		entidade.setDscEndereco(Paciente.getDsc_endereco());
		entidade.setNomPaciente(Paciente.getNom_paciente());
		entidade.setNumCpfCliente(Paciente.getNum_cpf_cliente());
		
		PacienteEntity created = this.repository.save(entidade);
		
		return created;
	}
	
	public PacienteEntity getPaciente(int id) {
		Optional<PacienteEntity> paciente = this.repository.findById(id);
		
		if (paciente.isPresent()) {
			return paciente.get();
		}
		
		return null;
	}
	
}
