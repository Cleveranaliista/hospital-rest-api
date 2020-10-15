package br.com.hospital.restapi.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Paciente")
public class PacienteEntity {

	@Id
	@Column(name = "cod_paciente")
	private int codPaciente;

	@Column(name = "num_cpf_cliente")
	private String numCpfCliente;
	
	@Column(name = "nom_paciente")
	private String nomPaciente;
	
	@Column(name = "dsc_endereco")
	private String dscEndereco;

	public int getCodPaciente() {
		return codPaciente;
	}

	public void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
	}

	public String getNumCpfCliente() {
		return numCpfCliente;
	}

	public void setNumCpfCliente(String numCpfCliente) {
		this.numCpfCliente = numCpfCliente;
	}

	public String getNomPaciente() {
		return nomPaciente;
	}

	public void setNomPaciente(String nomPaciente) {
		this.nomPaciente = nomPaciente;
	}

	public String getDscEndereco() {
		return dscEndereco;
	}

	public void setDscEndereco(String dscEndereco) {
		this.dscEndereco = dscEndereco;
	}
	
	
}
