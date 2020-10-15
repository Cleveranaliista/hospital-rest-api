package br.com.hospital.restapi.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atendimento")
public class AtendimentoEntity {

	@Id
	@Column(name = "cod_atendimento")
	private int CodAtendimento;
	
	@Column(name = "cod_paciente")
	private int CodPaciente;
	
	@Column(name = "cod_plano_saude")
	private int CodPlanoSaude;

	@Column(name = "dat_atendimento")
	private int DatAtendimento;
	
	public int getCodAtendimento() {
		return CodAtendimento;
	}

	public void setCodAtendimento(int codAtendimento) {
		CodAtendimento = codAtendimento;
	}

	public int getCodPaciente() {
		return CodPaciente;
	}

	public void setCodPaciente(int codPaciente) {
		CodPaciente = codPaciente;
	}

	public int getCodPlanoSaude() {
		return CodPlanoSaude;
	}

	public void setCodPlanoSaude(int codPlanoSaude) {
		CodPlanoSaude = codPlanoSaude;
	}

	public Date getDatAtendimento(Date DatAtendimento) {
		return DatAtendimento;
	}

	public int setDatAtendimento(int DatAtendimento) {
		return DatAtendimento;
	}


}
