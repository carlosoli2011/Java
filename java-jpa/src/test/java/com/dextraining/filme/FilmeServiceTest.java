package com.dextraining.filme;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextraining.jpa.EntityManagerUtil;

import br.com.dextraining.filme.Ator;
import br.com.dextraining.filme.AtorService;
import br.com.dextraining.filme.Categoria;
import br.com.dextraining.filme.CategoriaService;
import br.com.dextraining.filme.Diretor;
import br.com.dextraining.filme.DiretorService;
import br.com.dextraining.filme.Filme;
import br.com.dextraining.filme.FilmeService;

public class FilmeServiceTest {
	
	private CategoriaService categoriaService = new CategoriaService();
	private AtorService atorService = new AtorService();
	private DiretorService diretorService = new DiretorService();
	private FilmeService filmeService = new FilmeService();

	@After
	public void close() {
		EntityManagerUtil.fechar();
	}
	
	@Test
	public void salvarFilmeTest(){
		FilmeService filmeService = new FilmeService();
		
		criarCampos();	
	}

	private void criarCampos() {
		
		
		Categoria categoria = new Categoria();
		categoria.setNome("Cartoons");
		this.categoriaService.salvar(categoria);
		
		Categoria categoria2 = new Categoria();
		categoria2.setNome("Ação");
		this.categoriaService.salvar(categoria2);
		
		Ator ator = new Ator();
		ator.setNome("Nome do Ator");
		this.atorService.salvar(ator);
		
		Ator ator2 = new Ator();
		ator2.setNome("Nome do Ator2");
		this.atorService.salvar(ator2);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Nome do Diretor");
		this.diretorService.salvar(diretor);
		
		Diretor diretor2 = new Diretor();
		diretor2.setNome("Nome do Diretor2");
		this.diretorService.salvar(diretor2);
		
		Filme filme = new Filme();
		filme.setNome("Funny");
		filme.setDataDeLancamento(new Date());
		filme.setCategorias(Arrays.asList(categoria));
		filme.setAtores(Arrays.asList(ator));
		filme.setDiretor(diretor);
		filmeService.salvar(filme);
		
		Assert.assertNotNull(categoria.getId());
		Assert.assertNotNull(ator.getId());
		Assert.assertNotNull(diretor.getId());
		Assert.assertNotNull(filme.getId());
		
	}
}
