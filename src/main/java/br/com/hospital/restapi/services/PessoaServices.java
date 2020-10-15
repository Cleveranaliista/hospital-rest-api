package br.com.hospital.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.hospital.restapi.model.Pessoa;

@Service
public class PessoaServices {

	private static List<Pessoa> pessoas;

	public PessoaServices() {

		pessoas = new ArrayList<Pessoa>();

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Clever Junior");
		pessoa.setIdade("39");

		pessoas.add(pessoa);

		pessoa = new Pessoa();
		pessoa.setNome("Cristiana de Cassia");
		pessoa.setIdade("34");

		pessoas.add(pessoa);
	}

	public static List<Pessoa> listaDePessoas() {
		return pessoas;
	}
	
	public static Pessoa getPessoaPorId(Integer id){
		return pessoas.get(id);
	}

}