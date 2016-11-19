package com.dextraining.service;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;

import com.dextraining.jpa.EntityManagerUtil;

public class GenericService <T>{
	
	private Class<T> targetClass;
	
	public GenericService(Class<T> targetClass){
		this.targetClass = targetClass;
	}
	
	public void salvar(T entidade){
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			em.getTransaction().begin();//abrindo a transacao
			em.persist(entidade); //salva entidade
			
			//codigo considerado como bloco
			em.getTransaction().commit();
		}catch(Exception e){
			em.getTransaction().rollback();
			throw e;
		}finally {
			em.close();
		}
	}
	
	public T buscarPorId(Long id){
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			return em.find(targetClass, id);
		}finally {
			em.close();
		}
		
	}
	
	public List<T> listarTodas(){
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			String jpql = "select e FROM " + targetClass.getSimpleName() + " e";
			TypedQuery<T> query = em.createQuery(jpql, targetClass);
			return query.getResultList();
		}finally {
			em.close();
		}
			
	}
}
