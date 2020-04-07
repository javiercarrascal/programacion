package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HolaMundo
 */
@WebServlet("/piramide")
public class Piramide extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Piramide() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int numero = 0;
		if(request.getParameter("numero")!=null) {
			numero = Integer.parseInt(request.getParameter("numero"));
		}
		
		response.setContentType ( "text / html; charset = UTF-8" ) ;
		for(int i=0;i<numero;i++) {
			response.getWriter().append("<br>");
			for (int j=0;j<(numero-i);j++) {
				response.getWriter().append(" &nbsp " );
			}
			for (int j=0;j<i;j++) {
				response.getWriter().append(" * &nbsp" );
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	
	
	
	
	

}
