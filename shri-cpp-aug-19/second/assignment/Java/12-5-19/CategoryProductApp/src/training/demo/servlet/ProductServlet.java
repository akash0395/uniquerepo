package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProductServlet extends HttpServlet {
	HashMap<String,ArrayList<String>> hm;
	public void init() {
		hm=new HashMap<>();
		ArrayList<String> al=new ArrayList<>();
		al.add("sport shoes");
		al.add("Walking shoes");
		al.add("Fomal shoes");
		hm.put("Shoes", al);
		ArrayList<String> al1=new ArrayList<>();
		al1.add("traveller bag");
		al1.add("cabin bag");
		al1.add("sack");
		hm.put("bags", al1);
		ArrayList<String> al2=new ArrayList<>();
		al2.add("formal");
		al2.add("casual");
		al2.add("T-Shirts");
		hm.put("shirts", al2);
		ServletContext ctx=getServletContext();
		ctx.setAttribute("plist", hm);
	}
	
	
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		System.out.println("Id in productServlet : "+session.getId());
		String[] v=req.getParameterValues("cat");
		if(session.getAttribute("uname")!=null) {
			out.println("<form action='billing' method='post'>");
		for(String data :v) {
			out.println("<ul>Value selected : "+data);
			List<String> plst=hm.get(data);
			for(String p:plst) {
			   out.println("<li><input type='checkbox' name='"+data+"p' value='"+p+"'>"+p+"</li>");
			}
			out.println("</ul>");
			
		}
		out.print("<input type='submit' name='btn' value='submit'>");
		out.println("</form>");
		}else {
			out.println("pls login!!");
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
			rd.include(req, resp);
			
		}
		
	}

}
