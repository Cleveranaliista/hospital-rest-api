package br.com.hospital.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.hospital.restapi.dao.AtendimentoEntity;

public interface AtendimentoRepository extends CrudRepository<AtendimentoEntity, Integer> {
}
