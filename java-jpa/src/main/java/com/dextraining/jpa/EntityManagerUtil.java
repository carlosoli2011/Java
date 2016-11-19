package com.dextraining.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	private static EntityManagerFactory factory;//cria uma umica EntityManagerFactory e utiliza-a enquanto rodamos a aplicação
	//vale enquanto a classe estiver diferente de null
	
	public static EntityManager criarEntityManager(){//se null cria um managerFactory
		if(factory == null){
			factory = Persistence.createEntityManagerFactory("CURSO_JPA");
		}
		return factory.createEntityManager();//retorna enntity manager
	}
	
	public static void fechar(){//fecha a conexao caso factory não esteja null
		if(factory != null){
			factory.close();
			factory = null;
		}
	}
}
