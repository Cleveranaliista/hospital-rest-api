package br.com.hospital.restapi.model;

import java.util.Date;

public class Atendimento {
	
	private int CodAtendimento;
	private int CodPaciente;
	private int CodPlanoSaude;
	private Date DatAtendimento;
	
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
	public Date getDatAtendimento() {
		return DatAtendimento;
	}
	public void setDatAtendimento(Date datAtendimento) {
		DatAtendimento = datAtendimento;
	}
	
}
