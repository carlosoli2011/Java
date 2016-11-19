package com.dextraining.banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import com.dextraining.jpa.EntityManagerUtil;

import javassist.bytecode.stackmap.BasicBlock.Catch;

public class BancoServiceTest {
	
	@After
	public void close(){
		EntityManagerUtil.fechar();
	}
	
	@Test
	public void salvarBancoTeste(){
		BancoService bancoService = new BancoService();
		
		Banco bancoBradesco = new Banco();
		bancoBradesco.setNome("Banco do Bradesco");
		
		Banco bancoBrasil = new Banco();
		bancoBrasil.setNome("Banco do Brasil");
		
		bancoService.salvar(bancoBradesco);
		bancoService.salvar(bancoBrasil);

		Assert.assertNotNull("ID do Banco do Bradesco não pode ser NULO", bancoBradesco.getId());
		Assert.assertNotNull("ID do Banco do Bradesco não pode ser NULO", bancoBrasil.getId());
	}
	
	@Test
	public void buscarPorIdTest(){
		BancoService bancoService = new BancoService();
		Banco bancoBrasil = new Banco();
		bancoBrasil.setNome("Banco do Brasil");
		bancoService.salvar(bancoBrasil);
		
		Banco banco = bancoService.buscarPorId(-1L);//-1L tipo long // passa a busca com o valor -1L
		Banco bancoEncontrado = bancoService.buscarPorId(bancoBrasil.getId());//pega o getId do bancoBrasil
		
		Assert.assertNull(banco);//verifica se é null
		Assert.assertNotNull(bancoEncontrado);//verifica se não é null
		Assert.assertEquals(bancoBrasil.getNome(), bancoEncontrado.getNome());//verifica se bancoBrasil == bancoEncontrado
	}
}
