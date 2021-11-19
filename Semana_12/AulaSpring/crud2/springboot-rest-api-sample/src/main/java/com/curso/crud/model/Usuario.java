package com.curso.crud.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private int idade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		
		return
		"<h3>Usuário cadastrado!</h3>"
		+"<h4>Dados:</h4>"
		+"    <table>\r\n"
		+ "        <tr>\r\n"
		+ "            <td>Nome: </td>\r\n"
		+ "            <td>"+nome+"</td>\r\n"
		+ "        </tr>\r\n"
		+ "        <tr>\r\n"
		+ "            <td>Idade: </td>\r\n"
		+ "            <td>"+idade+"</td>\r\n"
		+ "        </tr>\r\n"
		+ "    </table>"		
		;
	}

}
