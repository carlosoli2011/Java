package com.pousar.domain.viagem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.pousar.app.util.Strings;
import com.pousar.domain.ValidacaoException;
import com.pousar.domain.usuario.Usuario;
import com.pousar.jpa.BaseService;
import com.pousar.jpa.EntityManagerUtil;

public class ViagemService extends BaseService<Viagem> {

	public ViagemService() {
		super(Viagem.class);
	}

	@Override
	public void salvar(Viagem viagem) {
		// TODO: Implementar validacoes e salvar no banco de dados.
		if(viagem.getPreco() == 0){//se for nulo faca
			throw new ValidacaoException("Preço não pode estar vazio");
		}
		validarVoo(viagem.getIda());
		validarVoo(viagem.getVolta());
		super.salvar(viagem);
	}

	public List<Viagem> buscarPor(String origem, String destino, Date dataSaida, Date dataVolta) {
		/**
		 * TODO: Metodo que deve buscar uma viagem por origem, destino e datas.
		 */
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			StringBuilder jpql = new StringBuilder();
			jpql.append("SELECT v FROM Viagem v WHERE 1=1 ");
			if(origem != null){//se nao esta vazio
				jpql.append("AND UPPER(u.origem) LIKE UPPER(:origem)");	
			}
			if(destino != null){//se nao esta vazio
				jpql.append("AND UPPER(u.destino) LIKE UPPER(:destino)");	
			}
			if(dataSaida != null){//se nao esta vazio
				jpql.append("AND UPPER(u.dataSaida) LIKE UPPER(:dataSaida)");	
			}
			if(dataVolta != null){//se nao esta vazio
				jpql.append("AND UPPER(u.dataVolta) LIKE UPPER(:dataVolta)");	
			}
			Query query = em.createQuery(jpql.toString());
			if(origem != null){
				query.setParameter("origem", "%" + origem + "%");
			}
			if(destino != null){
				query.setParameter("destino", "%" + destino + "%");
			}
			if(dataSaida != null){
				query.setParameter("dataSaida", "%" + dataSaida + "%");
			}
			if(dataVolta != null){
				query.setParameter("dataVolta", "%" + dataVolta + "%");
			}
			return query.getResultList();
			
		}catch (NoResultException e) {
			return null;
		}finally {
			em.close();
		}
	}
	
	private void validarVoo(Voo voo){
		if(voo.getOrigem() == null){
			throw new ValidacaoException("Campo Origem não pode ser vazio");
		}
		if(voo.getDestino() == null){
			throw new ValidacaoException("Campo Destino não pode ser vazio");
		}
		if(voo.getDataHoraChegada() == null){
			throw new ValidacaoException("Campo Data Hora Chegada não pode ser vazio");
		}
		if(voo.getDataHoraSaida() == null){
			throw new ValidacaoException("Campo Data Hora Saida não pode ser vazio");
		}
	}
}
