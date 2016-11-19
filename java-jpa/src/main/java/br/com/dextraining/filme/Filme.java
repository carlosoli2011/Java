package br.com.dextraining.filme;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

import com.dextraining.jpa.Entidade;

@Entity
public class Filme extends Entidade{
	
	private Date dataDeLancamento;
	
	@OneToOne
	private Diretor diretor;
	
	@ManyToMany
	private List<Categoria> categorias;
	
	@OneToMany
	private List<Ator> atores;
	
	

	public Date getDataDeLancamento() {
		return dataDeLancamento;
	}

	public void setDataDeLancamento(Date dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public List<Ator> getAtores() {
		return atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
	
	
}
