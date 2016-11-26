package com.pousar.domain.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.pousar.app.util.Strings;
import com.pousar.domain.ValidacaoException;
import com.pousar.jpa.BaseService;
import com.pousar.jpa.EntityManagerUtil;

public class UsuarioService extends BaseService<Usuario> {

	public UsuarioService() {
		super(Usuario.class);
	}

	@Override
	public void salvar(Usuario usuario) {
		if(Strings.isEmpty(usuario.getNome())){//se for nulo faca
			throw new ValidacaoException("Nome não pode estar vazio");
		}
		if(Strings.isEmpty(usuario.getEmail())){//se for nulo faca
			throw new ValidacaoException("E-mail não pode estar vazio");
		}
		if(Strings.isEmpty(usuario.getSenha())){//se for nulo faca
			throw new ValidacaoException("Senha não pode estar vazio");
		}
		Usuario usuarioEncontrado = buscarPorEmail(usuario.getEmail());
		if(usuarioEncontrado != null){//diferente de null
			if(!usuarioEncontrado.getId().equals(usuario.getId())){
				throw new ValidacaoException("E-mail já cadastrado");
			}
		}
		super.salvar(usuario);
	}

	public Usuario buscarParaLogin(String email, String senha) {
		// TODO: implementar login buscando dados no banco de dados
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			StringBuilder jpql = new StringBuilder();
			jpql.append("SELECT u FROM Usuario u ");
			jpql.append("WHERE u.email = :email AND u.senha = :senha ");
			
			Query query = em.createQuery(jpql.toString());
			query.setParameter("email", email);
			query.setParameter("senha", senha);
			return (Usuario) query.getSingleResult();
			
		}catch (NoResultException e) {
			return null;
		}finally {
			em.close();
		}
	}

	public Usuario buscarPorEmail(String email) {
		// TODO: Buscar usuario por email
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			StringBuilder jpql = new StringBuilder();
			jpql.append("SELECT u FROM Usuario u ");
			jpql.append("WHERE u.email = :email");
			
			Query query = em.createQuery(jpql.toString());
			query.setParameter("email", email);
			return (Usuario) query.getSingleResult();
			
		}catch (NoResultException e) {
			return null;
		}finally {
			em.close();
		}
	}

	public List<Usuario> buscarPor(String email, String nome) {
		// TODO: Buscar usuario por email ou nome
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			StringBuilder jpql = new StringBuilder();
			jpql.append("SELECT u FROM Usuario u WHERE 1=1 ");
			if(Strings.isNotEmpty(email)){//se nao esta vazio
				jpql.append("AND UPPER(u.email) LIKE UPPER(:email)");	
			}
			if(Strings.isNotEmpty(nome)){//se nao esta vazio
				jpql.append("AND UPPER(u.nome) LIKE UPPER(:nome)");
			}
			Query query = em.createQuery(jpql.toString());
			if(Strings.isNotEmpty(email)){
				query.setParameter("email", "%" + email + "%");
			}
			if(Strings.isNotEmpty(nome)){
				query.setParameter("nome", "%" + nome + "%");
			}
			return query.getResultList();
			
		}catch (NoResultException e) {
			return null;
		}finally {
			em.close();
		}
	}
	
	
}
