package com.dextraining.pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import com.dextraining.banco.Banco;
import com.dextraining.banco.BancoService;
import com.dextraining.jpa.EntityManagerUtil;

public class PessoaServiceTest {
	
	PessoaService pessoaService = new PessoaService();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
	
	@Test
	public void salvarPessoaTest()throws ParseException {
		

		Pessoa primeiraPessoa = new Pessoa();
		primeiraPessoa.setNome("João");
		Date dataNascimento1 = dateFormat.parse("22/02/1999");
		primeiraPessoa.setDataNascimento(dataNascimento1);
		primeiraPessoa.setCpf("122.333.254.22");
		
		Pessoa segundaPessoa = new Pessoa();
		segundaPessoa.setNome("Maria");
		Date dataNascimento2 = dateFormat.parse("22/02/1999");
		segundaPessoa.setDataNascimento(dataNascimento2);
		segundaPessoa.setCpf("222.222.222.22");
		
		pessoaService.salvar(primeiraPessoa);
		pessoaService.salvar(segundaPessoa);

		Assert.assertNotNull("ID da Pessoa não pode ser NULO", primeiraPessoa.getId());
		Assert.assertNotNull("ID da Pessoa não pode ser NULO", segundaPessoa.getId());
	}
	
	@Test
	public void buscarPessoaPorIdTest() throws ParseException{
		PessoaService pessoaService = new PessoaService();
		Pessoa pessoaCriada = new Pessoa();
		pessoaCriada.setNome("João");
		pessoaCriada.setCpf("111.111.111.11");
		Date dataNascimento = dateFormat.parse("22/02/1980");
		pessoaCriada.setDataNascimento(dataNascimento);
		pessoaService.salvar(pessoaCriada);
		
		Pessoa pessoa = pessoaService.buscarPorId(-1L);//-1L tipo long // passa a busca com o valor -1L
		Pessoa pessoaEncontrada = pessoaService.buscarPorId(pessoaCriada.getId());//pega o getId do primeiraPessoa
		
		Assert.assertNull("Id pessoa ", pessoa);
		Assert.assertNotNull("Id pessoaEncontrada ", pessoaEncontrada);//verifica se não é null
		Assert.assertEquals(pessoaCriada.getNome(), pessoaEncontrada.getNome());//verifica se pessoaCriada == pessoaEncontrada
	}
	
	@Test
	public void listarTodosTeste() throws ParseException{
		PessoaService pessoaService = new PessoaService();
		
		Pessoa pessoaCriada = new Pessoa();
		pessoaCriada.setNome("João");
		pessoaCriada.setCpf("111.111.111.11");
		Date dataNascimento = dateFormat.parse("22/02/1980");
		pessoaCriada.setDataNascimento(dataNascimento);
		pessoaService.salvar(pessoaCriada);
		
		
		List<Pessoa> pessoas = pessoaService.listarTodas();
		
		Assert.assertEquals(1, pessoas.size());
	}
	
	@After
	public void close(){
		EntityManagerUtil.fechar();
	}

}
