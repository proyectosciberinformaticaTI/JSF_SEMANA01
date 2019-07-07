package mitocode.demo.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ExtendServlet extends GenericServlet{

	@Override
	public void destroy() {
		System.out.println("***[DESTROY] Generic Servlet ***");		
	}

	@Override
	public void init() throws ServletException {
		System.out.println("***[INIT] Generic Servlet ***");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.getWriter().write("<html><body>GenericServlet - MitoCode</body></html>");
	}
	
}
