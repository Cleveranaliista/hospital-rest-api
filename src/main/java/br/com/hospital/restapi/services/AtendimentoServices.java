package br.com.hospital.restapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hospital.restapi.dao.AtendimentoEntity;
import br.com.hospital.restapi.model.Atendimento;
import br.com.hospital.restapi.repository.AtendimentoRepository;

@Service
public class AtendimentoServices {
	
	private AtendimentoRepository repository;
	
	@Autowired
	public AtendimentoServices(AtendimentoRepository repository) {
		this.repository = repository;
	}
	
	public AtendimentoEntity salvaAtendimento(Atendimento Atendimento) {
		AtendimentoEntity entidade = new AtendimentoEntity();
		
		entidade.setCodAtendimento(Atendimento.getCodAtendimento());
		entidade.setCodPaciente(Atendimento.getCodPaciente());
		entidade.setCodPlanoSaude(Atendimento.getCodPlanoSaude());
		entidade.getDatAtendimento(Atendimento.getDatAtendimento());
		
		AtendimentoEntity created = this.repository.save(entidade);
		
		return created;
	}
	public AtendimentoEntity getAtendimento(int id) {
		Optional<AtendimentoEntity> Atendimento = this.repository.findById(id);
		
		if (Atendimento.isPresent()) {
			return Atendimento.get();
		}
		
		return null;
	}
	
	
}
