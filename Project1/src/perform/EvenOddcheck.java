package perform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EvenOddcheck")
public class EvenOddcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=null;
		try{
			out=response.getWriter();
			int n=Integer.parseInt(request.getParameter("t1"));
			out.println(n+"<center>");
			if(n%2==0)
				out.println("<font color=blue>"+n+" is even number</font>");
			else
				out.println("<font color=green>"+n+"is odd number</font>");
		}
		catch(Exception e){
			out.println("Error! You have not enter number!!!!:"+e.getMessage());
		}
		finally{
			out.println("<br><br>");
			out.println("To goto main page<a href=index.html> CLICK HERE</a>");
			out.println("</center>");		
		}
	}
}
