package br.com.hospital.restapi.model;

public class Paciente {

	private int cod_paciente;
	private String num_cpf_cliente;
	private String nom_paciente;
	private String dsc_endereco;
	
	public int getCod_paciente() {
		return cod_paciente;
	}
	public void setCod_paciente(int cod_paciente) {
		this.cod_paciente = cod_paciente;
	}
	public String getNum_cpf_cliente() {
		return num_cpf_cliente;
	}
	public void setNum_cpf_cliente(String num_cpf_cliente) {
		this.num_cpf_cliente = num_cpf_cliente;
	}
	public String getNom_paciente() {
		return nom_paciente;
	}
	public void setNom_paciente(String nom_paciente) {
		this.nom_paciente = nom_paciente;
	}
	public String getDsc_endereco() {
		return dsc_endereco;
	}
	public void setDsc_endereco(String dsc_endereco) {
		this.dsc_endereco = dsc_endereco;
	}
	
	
}
