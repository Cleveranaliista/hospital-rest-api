package br.com.hospital.restapi.model;

public class PlanoSaude {
	
	private int cod_plano_saude;
	private String nom_plano_saude;
	private String ind_ativo ;
	
	public int getCod_plano_saude() {
		return cod_plano_saude;
	}
	public void setCod_plano_saude(int cod_plano_saude) {
		this.cod_plano_saude = cod_plano_saude;
	}
	public String getNom_plano_saude() {
		return nom_plano_saude;
	}
	public void setNom_plano_saude(String nom_plano_saude) {
		this.nom_plano_saude = nom_plano_saude;
	}
	public String getInd_ativo() {
		return ind_ativo;
	}
	public void setInd_ativo(String ind_ativo) {
		this.ind_ativo = ind_ativo;
	}
			
}
