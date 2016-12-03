package br.com.javaweb.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javaweb.gerenciador.Empresa;
import br.com.javaweb.gerenciador.dao.EmpresaDAO;

/**
 * Servlet implementation class CadastrarEmpresa
 */
@WebServlet("/adicionaEmpresa")
public class AdicionaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdicionaEmpresa() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		// buscando os parâmetros no request
        String nomeEmpresa = request.getParameter("nomeEmpresa");
        
        // monta um objeto Empresa
        Empresa empresa = new Empresa(nomeEmpresa);
        
        // salva a Empresa
        EmpresaDAO dao = new EmpresaDAO();
        dao.adiciona(empresa);
        
        StringBuffer html = new StringBuffer();
        /**
         *  imprime o nome da empresa que foi adicionado 
         *  (pode ser feito um redirecionamento para uma pagina via comando js)
         */
        html.append("<html>");
        html.append("<body>");
        html.append("Contato " + empresa.getNome() + 
                " adicionado com sucesso");
        html.append("</body>");
        html.append("</html>");
        
		PrintWriter out = response.getWriter();
		out.println(html);
        
        
	}

}
