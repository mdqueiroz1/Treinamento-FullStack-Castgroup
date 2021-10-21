package modelo;

import java.sql.Date;

public class Fornecedor {
	
	private int id;
	private String CNPJ;
	private String nome;
	private Date dataEntrega;
	private String distribuidora;
	private String DDD;
	private String telefone;


	//	GETTERS E SETTERS
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistribuidora() {
		return this.distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDDD() {
		return DDD;
	}
	public void setDDD(String dDD) {
		DDD = dDD;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Date getDataEntrega() {
		return this.dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
		
}
