package training.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BillingServlet
 */
@WebServlet("/billing")
public class BillingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String,ArrayList<String>> hm;
	public void init() {
		ServletContext ctx=getServletContext();
		hm=(HashMap<String, ArrayList<String>>) ctx.getAttribute("plist");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		if(session.getAttribute("uname")!=null) {
			out.println("Welcome "+session.getAttribute("uname")+"<br>");
			out.println("Thank you for purchase done!! Do visit again"+"<br>");
			Enumeration<String> param=req.getParameterNames();
			int cnt=0;
			while(param.hasMoreElements()) {
				String cat=param.nextElement();
				String[] plst=req.getParameterValues(cat);
				for(String s:plst) {
					out.println("you selected "+s+"<br>");
					if(!cat.equals("btn"))
					  cnt++;
					
				}
				
			}
			out.println("No of items : "+cnt);
			
			session.invalidate();
		}
	}

}
