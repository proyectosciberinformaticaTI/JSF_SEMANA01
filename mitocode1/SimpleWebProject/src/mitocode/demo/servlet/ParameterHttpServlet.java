package mitocode.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/parameter")
@WebServlet(
			name = "ParameterServlet",
			description = "Este es un servlet de parametros",
			urlPatterns = {"/parameter","/parameters"},
			initParams = {
					@WebInitParam(name = "param1",value = "Mito"),
					@WebInitParam(name = "param2",value = "Code")
			}
		)

public class ParameterHttpServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String param1 = this.getInitParameter("param1");
		String param2 = this.getInitParameter("param2");
		//String param1 = req.getParameter("param1");
		//String param2 = req.getParameter("param2");
		
		
		resp.getWriter().write("param1 " + param1 + "- param2 " + param2);
	}
	
	
	
}
