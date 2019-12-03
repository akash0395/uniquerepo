package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CategoryServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		String[] arr= {"Shoes","shirts","bags"};
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		System.out.println("Id in category :"+session.getId());
		if(session.getAttribute("uname")!=null) {
		out.println("In Category Servlet");
		out.print("<form action='product' method='get'>");
		for(String s:arr) {
			
			out.println("<input type='checkbox' name='cat' value='"+s+"'>"+s+"<br>");
		}
		out.println("<input type='submit' name='btn' value='Submit'>");
		out.print("</form>");
		System.out.println("Method : "+req.getMethod());
		}
		else {
			out.println("pls login!!");
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			rd.include(req, resp);
			
		}
		
	}
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		doPost(req,resp);
		
	}

}
