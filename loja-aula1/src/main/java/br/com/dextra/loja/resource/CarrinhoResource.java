package br.com.dextra.loja.resource;

import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.thoughtworks.xstream.XStream;

import br.com.dextra.loja.dao.CarrinhoDAO;
import br.com.dextra.loja.modelo.Carrinho;
import br.com.dextra.loja.modelo.Produto;
//recurso carrinhos
@Path("carrinhos")//URI do servico
public class CarrinhoResource {//
	
	@Path("{id}")//parte de minha URI ex: carrinhos/1
	@GET
	@Produces(MediaType.APPLICATION_JSON)//qual será o formato de retorno do http JSON ou XML
	//public String busca() {//recurso para listar carrinho
		//Carrinho carrinho = new CarrinhoDAO().busca(1l);//passando um parametro statico
		
	//public String  busca(@QueryParam("id") long id){//recurso para listar carrinho com parametro passado na uri
	//	Carrinho carrinho = new CarrinhoDAO().busca(id);
	//	return carrinho.toXML();				
	//}
	
	public String  busca(@PathParam("id") long id){//recurso para listar carrinho com parametro passado na uri
		Carrinho carrinho = new CarrinhoDAO().busca(id);
		return carrinho.toJSON();//formata JSON ou XML				
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response adiciona(String conteudo){
		Carrinho carrinho = (Carrinho) new XStream().fromXML(conteudo);
		new CarrinhoDAO().adiciona(carrinho);
		URI uri = URI.create("/carrinhos/" + carrinho.getId());
		return Response.created(uri).build();
	}
	
	@Path("{id}/produtos/{produtoId}")//delete de produto
	@DELETE
	public Response removeProduto(@PathParam("id") long id, @PathParam("produtoId") long produtoId){
		Carrinho carrinho = new CarrinhoDAO().busca(id);
		carrinho.remove(produtoId);
		return Response.ok().build();
	}
	
	@Path("{id}")
	@DELETE
	public Response removeCarrinho(@PathParam("id") long id){
		new CarrinhoDAO().remove(id);
		return Response.ok().build();
	}
	
	@Path("{id}/produtos/{produtoId}")//altera produto
	@PUT
	public Response alteraProduto(String novoProduto, @PathParam("id") long id, @PathParam("produtoId") long produtoId){
		Carrinho carrinho = new CarrinhoDAO().busca(id);
		Produto produto = (Produto) new XStream().fromXML(novoProduto);//cast de produto que foi pego do xml
		carrinho.troca(produto);
		return Response.ok().build();
		//para testar a alteração crie um curl
	}
	
	@Path("{id}/produtos/{produtoId}/quantidade")//altera quantidade do produto
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response alteraQuantidadeProduto(String 
		novaQuantidadeProduto,@PathParam("id") long id, 
		@PathParam("produtoId") long produtoId) {
			
		Carrinho carrinho = new CarrinhoDAO().busca(id);
		//cast de produto que foi pego do xml
		Produto produto = (Produto) new XStream()
					.fromXML(novaQuantidadeProduto);
		carrinho.trocaQuantidade(produto);
		return Response.ok().build();
		//para testar a alteração crie um curl
	}
	
}
