package com.dextraining.garagem.dominio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import com.dexraining.garagem.jpa.EntityManagerUtil;
import com.dextraining.garagem.dominio.veiculo.Veiculo;
import com.dextraining.garagem.exception.ValidacaoException;
import com.dextraining.garagem.exception.VeiculoDuplicadoException;
import com.dextraining.garagem.exception.VeiculoNaoEncontradoException;

public class GaragemJPA implements Garagem {

	private void salvar(Veiculo entidade) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(entidade);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw e;
		} finally {
			em.close();
		}
	}

	@Override
	public void adicionar(Veiculo veiculo) {
		// TODO Salvar novo veiculo no banco de dados
		if (veiculo.getMarca() == null || veiculo.getMarca().isEmpty()) {
			throw new com.dextraining.garagem.exception.ValidacaoException("Marca não pode estar vazia");
		}
		if (veiculo.getModelo() == null || veiculo.getModelo().isEmpty()) {
			throw new com.dextraining.garagem.exception.ValidacaoException("Modelo não pode estar vazio");
		}
		if (veiculo.getPlaca() == null || veiculo.getPlaca().isEmpty()) {
			throw new com.dextraining.garagem.exception.ValidacaoException("Placa não pode estar vazia");
		}
		if (veiculo.getAno() <= 0) {
			throw new com.dextraining.garagem.exception.ValidacaoException("Data nao pode estar vazia");
		}
		if (veiculo.getPreco() == null || veiculo.getPreco() <= 0) {
			throw new com.dextraining.garagem.exception.ValidacaoException("Valor invalido");
		}
		Veiculo veiculoEncontrado = buscar(veiculo.getPlaca());
		if (veiculoEncontrado != null) {
			throw new VeiculoDuplicadoException();
		}
		salvar(veiculo);
		// TODO IMPORTANTE: Validar duplicidade da placa do veiculo
	}

	@Override
	public void vender(String placa) {
		// TODO Implementar venda de veiculo por placa
		Veiculo veiculo = buscar(placa);
		if (veiculo == null) {
			throw new VeiculoNaoEncontradoException();
		}
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(em.merge(veiculo));
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

	@Override
	public Veiculo buscar(String placa) {
		// TODO Implementar busca de veiculo por placa
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			String jpql = "SELECT v FROM Veiculo v WHERE v.placa = :placa";
			TypedQuery<Veiculo> query = em.createQuery(jpql, Veiculo.class);
			query.setParameter("placa", placa);
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		} finally {
			em.close();
		}
	}

	@Override
	public List<Veiculo> listar() {
		// TODO: Implementar consulta que lista todos os veiculos ordenados por:
		// marca;
		// modelo;
		// ano;
		// preco;
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			String jpql = "SELECT v FROM Veiculo v ORDER BY v.marca, v.modelo, v.ano, v.preco";
			TypedQuery<Veiculo> query = em.createQuery(jpql, Veiculo.class);
			return query.getResultList();
		} finally {
			em.close();
		}
	}
}
