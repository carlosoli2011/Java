package com.pousar.jpa;

import javax.persistence.EntityManager;

public class BaseService<T extends Entidade> {

	private Class<T> targetclass;

	public BaseService(Class<T> classe) {
		this.targetclass = classe;
	}

	/**
	 * Salva ou atualiza os dados de uma entidade usando o EntityManager.
	 * 
	 * @param entidade
	 * @return
	 */
	public void salvar(T entidade) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			em.getTransaction().begin();//abrindo a transacao
			if(entidade.getId() == null){
				em.persist(entidade); //salva entidade
			}else{
				em.merge(entidade);
			}
			
			//codigo considerado como bloco
			em.getTransaction().commit();
		}catch(Exception e){
			em.getTransaction().rollback();
			throw e;
		}finally {
			em.close();
		}
	}

	public T buscarPorId(Long id) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			return em.find(targetclass, id);
		}finally {
			em.close();
		}
	}

	public void remover(Long id) {
		// TODO: implementar
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			em.getTransaction().begin();
			T entidade = em.find(targetclass, id);
			em.remove(entidade);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw e;
		} finally {
			em.close();
		}
	}
}
