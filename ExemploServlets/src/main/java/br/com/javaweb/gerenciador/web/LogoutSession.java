package br.com.javaweb.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.javaweb.gerenciador.Usuario;
import br.com.javaweb.gerenciador.dao.UsuarioDAO;

/**
 * Servlet implementation class UserLogout
 */

@WebServlet("/logoutsession")
public class LogoutSession extends HttpServlet {
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		if(session.getAttribute("usuario.logado") != null){
			session.removeAttribute("usuario.logado");
			session.invalidate();
			RequestDispatcher dispatcher = 
			request.getRequestDispatcher("/WEB-INF/paginas/logout.html");
			dispatcher.forward(request, response);
		}

	}
}
