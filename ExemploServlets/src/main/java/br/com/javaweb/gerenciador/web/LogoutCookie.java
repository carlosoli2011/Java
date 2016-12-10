package br.com.javaweb.gerenciador.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javaweb.gerenciador.Usuario;
import br.com.javaweb.gerenciador.dao.UsuarioDAO;

/**
 * Servlet implementation class UserLogout
 */

@WebServlet("/logout")
public class LogoutCookie extends HttpServlet {
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie cookie = new Cookies(request.getCookies()).buscaUsuarioLogado();
		if (cookie == null) {
			response.sendRedirect("/ExemploServletsCookies/logout.html");
			return;
		}
		// Matando o cookie
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		response.sendRedirect("/ExemploServletsCookies/logout.html");

	}
}
