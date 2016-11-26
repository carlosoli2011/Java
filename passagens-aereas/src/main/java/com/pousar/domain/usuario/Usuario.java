package com.pousar.domain.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.pousar.jpa.Entidade;

/**
 * Classe que representa um usuario do sistema
 */

@Entity
public class Usuario extends Entidade {

	@Column(length = 200, nullable = false)
	private String nome;
	@Column(length = 200, unique = true, nullable = false)
	private String email;
	@Column(length = 200, nullable = false)
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
