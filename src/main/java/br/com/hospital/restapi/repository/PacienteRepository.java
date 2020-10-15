package br.com.hospital.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.hospital.restapi.dao.PacienteEntity;

public interface PacienteRepository extends CrudRepository<PacienteEntity, Integer> {
}
