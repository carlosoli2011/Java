package br.com.dextra.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import junit.framework.Assert;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.dextra.loja.modelo.Carrinho;
import br.com.dextra.loja.modelo.Produto;

public class ClientTest {
	
	private HttpServer server;
	
	@Before
	public void inicializaServidor(){
		this.server = Servidor.inicializaServidor();
	}
	
	@After
	public void paraServidor() {
		server.stop();
	}

	//@Test
	public void testaQueAConexaoComOServidorFunciona() {
		Client client = ClientBuilder.newClient();
		//WebTarget target = client.target("http://www.mocky.io");
		//String conteudo = target.path("v2/54eb56c0fab2e6f405edbaab").request().get(String.class);

		WebTarget target = client.target("http://localhost:8080");
		String conteudo = target.path("/carrinhos").
				queryParam("id", 1).
				request().get(String.class);

		Carrinho carrinho = (Carrinho) new XStream().fromXML(conteudo);
		Assert.assertEquals("Polo de Tecnologia", carrinho.getRua());
		
		
		System.out.println(conteudo);
		
		
	}
	
	//@Test
	public void testaQueBuscaUmCarrinhoTrazOCarrinhoEsperadoXML() {
		Client client = ClientBuilder.newClient();
		//WebTarget target = client.target("http://www.mocky.io");
		//String conteudo = target.path("v2/54eb56c0fab2e6f405edbaab").request().get(String.class);

		WebTarget target = client.target("http://localhost:8080");
		String conteudo = target.path("/carrinhos").
				path("1").//concatena
				request().get(String.class);

		Carrinho carrinho = (Carrinho) new XStream().fromXML(conteudo);
		Assert.assertEquals("Polo de Tecnologia", carrinho.getRua());
		
		
		System.out.println(conteudo);
		
		
	}
	
	@Test
	public void testaQueBuscaUmCarrinhoTrazOCarrinhoEsperadoJSON() {
		Client client = ClientBuilder.newClient();
		//WebTarget target = client.target("http://www.mocky.io");
		//String conteudo = target.path("v2/54eb56c0fab2e6f405edbaab").request().get(String.class);

		WebTarget target = client.target("http://localhost:8080");
		String conteudo = target.path("/carrinhos").
				path("1").//concatena
				request().get(String.class);

		Carrinho carrinho = new Gson().
				fromJson(conteudo, Carrinho.class);//converte para um objeto carrinho
		Assert.assertEquals("Polo de Tecnologia", carrinho.getRua());
		
		System.out.println(conteudo);
	}
	
	@Test
	public void testaCriacaoNovoCarrinho(){
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		Carrinho carrinho = new Carrinho();
		Produto produto = new Produto(3, "Cerveja Bohemia", 3.5, 1);
		
		carrinho.adiciona(produto);
		carrinho.setCidade("Campinas");
		carrinho.setId(3);
		carrinho.setRua("Polis");
		
		String converteCarrinhoXML = carrinho.toXML();
		
		Entity<String> entity = Entity.entity(
				converteCarrinhoXML, 
				javax.ws.rs.core.MediaType.APPLICATION_XML);
		
		Response response = target.path("/carrinhos").
				request().post(entity);
		
		Assert.assertEquals(
				201,
				response.getStatus());
		
		
	}
	
	@Test
	public void testaDeleteProdutoDoCarrinho(){
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		
		Response response = target.path(
				"/carrinhos/1/produtos/6237").
				request().delete();
		
		Assert.assertEquals(
				200, 
				response.getStatus());
	}
	
	
	
	@Test
	public void testaAlteraProduto() {
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target("http://localhost:8080");
		
		Produto produto = new Produto(
				3467, "Cerveja Bohemia", 3.5, 10);
		
		String converteProdutoXML = new XStream().toXML(produto);

		Entity<String> entity = Entity.entity(
				converteProdutoXML, 
				javax.ws.rs.core.MediaType.APPLICATION_XML);

		Response response = target.path("/carrinhos/1/produtos/3467").
				request().put(entity);

		Assert.assertEquals(200, response.getStatus());
	}
	
	@Test
	public void testaDeleteCarrinho(){
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		
		Response response = target.path(
				"/carrinhos/1").
				request().delete();
		
		Assert.assertEquals(
				200, 
				response.getStatus());
	}
	
	
}
