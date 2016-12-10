package br.com.javaweb.gerenciador.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javaweb.gerenciador.Usuario;

/**
 * Servlet Filter implementation class FiltroDeAuditoria
 */
@WebFilter(urlPatterns = "/*")
public class FiltroDeAuditoriaSession implements Filter {

	/**
	 * Default constructor.
	 */
	public FiltroDeAuditoriaSession() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		
		String uri = req.getRequestURI();
		String usuario = getUsuario(req);
		
		System.out.println("Usuario " + usuario + " acessando a URI "
                + uri);
        
        chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * 
	 * O servlet conteiner usa um cookie chamado JsessionId para indicar o codigo do usuario atual.
	 * No Servidor ele armazena em um tipo de hashmap qual o codigo e quais os dados atralados ao usuario
	 */
	private String getUsuario(HttpServletRequest req) {
		Usuario usuario = (Usuario) req.getSession().getAttribute("usuario.logado");
		if (usuario == null)
			return "<Deslogado>";
		
		return usuario.getEmail();
	}

}
