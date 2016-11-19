package br.com.dextraining.filme;

import javax.persistence.EntityManager;

import com.dextraining.jpa.EntityManagerUtil;
import com.dextraining.service.GenericService;

public class AtorService extends GenericService<Ator>{
	public AtorService() {
		super(Ator.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void salvar(Ator entidade) {
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try {
			em.getTransaction().begin();
			if (entidade.getId() == null) {
				em.persist(entidade);
			} else {
				em.merge(entidade);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw e;
		} finally {
			em.close();
		}
	}
}
