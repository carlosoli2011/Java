package com.pousar.domain.viagem;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.pousar.jpa.Entidade;

@Entity
public class Viagem extends Entidade {

	@OneToOne(cascade = CascadeType.ALL)
	private Voo ida;
	@OneToOne(cascade = CascadeType.ALL)
	private Voo volta;
	@Column(length = 20, nullable = false)
	private double preco;

	public Voo getIda() {
		return ida;
	}

	public void setIda(Voo ida) {
		this.ida = ida;
	}

	public Voo getVolta() {
		return volta;
	}

	public void setVolta(Voo volta) {
		this.volta = volta;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
