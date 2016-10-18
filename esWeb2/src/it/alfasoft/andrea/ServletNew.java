package it.alfasoft.andrea;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletNew
 */
@WebServlet(description = "una descrizione di servlet", urlPatterns = { "/aaa" })
public class ServletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");	
				
//		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
	
		
		if(password.equals("123")){			
			RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
			rd.forward(request, response);

			} else{
				
				PrintWriter wr=response.getWriter();
				wr.println("user o password errati");
				RequestDispatcher rd2=request.getRequestDispatcher("login.html");
				rd2.include(request, response);
//				response.sendRedirect("login.html");
			}
	
	}
	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String username=request.getParameter("username");
//		String password=request.getParameter("password");
//		
//		PrintWriter wr=response.getWriter();
//		if(password.equals("123")){		
//		wr.println("benvenuto "+username);
//		} else{
//		
//		response.sendRedirect("login.html");
//		}
//	
//	}
	


}
