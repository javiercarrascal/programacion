package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcesarFormulario
 */
@WebServlet("/procesarformulario")
public class ProcesarFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ProcesarFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int hijos = 0;
		String nombre="";
		if(request.getParameter("hijos")!=null) {
			hijos = Integer.parseInt(request.getParameter("hijos"));
		}
		if(request.getParameter("nombre")!=null) {
			nombre = request.getParameter("nombre");
		}
		response.setContentType ( "text / html; charset = UTF-8" ) ;
		response.getWriter().append("<h1>");
		response.getWriter().append(nombre + " tiene " + hijos + " hijos.");

		response.getWriter().append("</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
