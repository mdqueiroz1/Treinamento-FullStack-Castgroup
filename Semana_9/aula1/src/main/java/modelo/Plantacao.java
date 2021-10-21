package modelo;

import java.sql.Date;

public class Plantacao {
	private int id;
	private String proprietario;
	private String fazenda;
	private String tipoPlantacao;
	private Date dataPlantio;
	private Date dataColheita;


	//	Getters e Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public String getFazenda() {
		return fazenda;
	}
	public void setFazenda(String fazenda) {
		this.fazenda = fazenda;
	}
	public String getTipoPlantacao() {
		return tipoPlantacao;
	}
	public void setTipoPlantacao(String tipoPlantacao) {
		this.tipoPlantacao = tipoPlantacao;
	}
	public Date getDataPlantio() {
		return dataPlantio;
	}
	public void setDataPlantio(Date dataPlantio) {
		this.dataPlantio = dataPlantio;
	}
	public Date getDataColheita() {
		return dataColheita;
	}
	public void setDataColheita(Date dataColheita) {
		this.dataColheita = dataColheita;
	}
	

	
	
}
