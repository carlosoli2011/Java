package com.dextraining.investimento;

import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Test;

import com.dextraining.jpa.EntityManagerUtil;
import com.dextraining.pessoa.Pessoa;
import com.dextraining.pessoa.PessoaService;

public class InvestimentoServiceTest {
	
	InvestimentoService investimentoService = new InvestimentoService();
	
	@Test
	public void salvarTest() throws ParseException {
		
		Investimento primeiroInvestimento = new Investimento();
		primeiroInvestimento.setDescricao("investimento 1");
		primeiroInvestimento.setValor(1200.00);
		primeiroInvestimento.setRendimentoMensal(0.30);
		
		Investimento segundoInvestimento = new Investimento();
		segundoInvestimento.setDescricao("investimento 2");
		segundoInvestimento.setValor(300.00);
		segundoInvestimento.setRendimentoMensal(0.12);
		
		investimentoService.salvar(primeiroInvestimento);
		investimentoService.salvar(segundoInvestimento);
		
		Assert.assertNotNull("ID do Investimento não pode ser NULO", primeiroInvestimento.getId());
		Assert.assertNotNull("ID do Investimento não pode ser NULO", segundoInvestimento.getId());
		
	}
	
	@Test
	public void listarPorIdTest() throws ParseException{
		InvestimentoService investimentoService = new InvestimentoService();
		Investimento investimentoCriado = new Investimento();
		investimentoCriado.setDescricao("investimento 1");
		investimentoCriado.setValor(200.00);
		investimentoCriado.setRendimentoMensal(0.05);
		investimentoService.salvar(investimentoCriado);
		
		Investimento investimento = investimentoService.buscarPorId(-1L);//-1L tipo long // passa a busca com o valor -1L
		Investimento investimentoEncontrado = investimentoService.buscarPorId(investimentoCriado.getId());//pega o getId do primeiraPessoa
		
		Assert.assertNull("Id investimetno ", investimento);
		Assert.assertNotNull("Id investimentoEncontrado ", investimentoEncontrado);//verifica se não é null
		Assert.assertEquals(investimentoCriado.getDescricao(), investimentoEncontrado.getDescricao());//verifica se pessoaCriada == pessoaEncontrada
	}
	
	@Test
	public void salvarSemValorTest(){
		InvestimentoService investimentoService = new InvestimentoService();
		Investimento investimentoCriado = new Investimento();
		investimentoCriado.setDescricao("investimento 1");
		investimentoCriado.setRendimentoMensal(0.10);
		investimentoService.salvar(investimentoCriado);
		
	}
	
	@Test
	public void listarValorOrdenadoTest(){
		//InvestimentoService investimentoService = new InvestimentoService();
		//List<Investimento> investimentos = investimentoService.listarTodas();	
		System.out.println(buscarTodosPorValor());
	}
	
	@Test
	public void listarTodosValorRendimentoMaior(){
		System.out.println(consultarTodosValorRendimentoMaior());
	}
	
	
	public List<Investimento> buscarTodosPorValor(){
		String jpql = "";
		jpql += "Select i FROM Investimento i";
		jpql += " ORDER BY i.valor DESC";
		EntityManager em = EntityManagerUtil.criarEntityManager();
		
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
	public List<Investimento> consultarTodosValorRendimentoMaior(){
		String jpql = "";
		jpql += "Select i FROM Investimento i";
		jpql += " WHERE i.valor >= 1000 AND i.rendimentoMensal > 0.25";

		EntityManager em = EntityManagerUtil.criarEntityManager();
		
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
