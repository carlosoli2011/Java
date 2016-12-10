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

import com.sun.net.httpserver.Filter.Chain;

@WebFilter(urlPatterns="/*")
public class FiltroDeAuditoria implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;//pega request
		HttpServletResponse resp = (HttpServletResponse) response;//pega response
		
		Cookie cookie = getUsuario(req);
        String usuario = "<deslogado>";
        if (cookie != null)
        	cookie.setMaxAge(60*10);
        	resp.addCookie(cookie);
            usuario = cookie.getValue();
		System.out.println("Usuario: " + usuario +" acessando a URI "+ req.getRequestURI());
		//codigo executado antes da Servlet
		chain.doFilter(request, response);
		
		//codigo executado depois da servlet
		
	}
	
	private Cookie getUsuario(HttpServletRequest req) {//me da seus cookies
        Cookie[] cookies = req.getCookies();//retorna um array de cookies
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("usuario.logado")) {
                return cookie;
            }
        }
        return null;
    }

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
