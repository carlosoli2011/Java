package com.dextraining.investimento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(length = 50, nullable=false)
	private String descricao;
	
	@Column(nullable=false)
	private Double valor;
	
	@Column(nullable=false)
	private Double rendimentoMensal;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getRendimentoMensal() {
		return rendimentoMensal;
	}
	public void setRendimentoMensal(Double rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}
	@Override
	public String toString() {
		return "Investimento [id=" + id + ", descricao=" + descricao + ", valor=" + valor + ", rendimentoMensal="
				+ rendimentoMensal + "]";
	}
	
	
	
	

}
