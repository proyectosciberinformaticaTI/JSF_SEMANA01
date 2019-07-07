package mitocode.demo.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/response01")
public class ResponseServlet01 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("image/jpg");
		//resp.setHeader("Content-Disposition", "attachment; filename='wason.jpg'");
		
		ServletOutputStream out;
		out = resp.getOutputStream();
		
		String relativeWebPath = "/WEB-INF/resources/images/wason.jpg";
		InputStream fin = getServletContext().getResourceAsStream(relativeWebPath);
		
		BufferedInputStream bin = new BufferedInputStream(fin);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		int ch = 0;
		
		while((ch = bin.read()) != -1){
			bout.write(ch);
		}
		bin.close();
		fin.close();
		bout.close();
		out.close();
	}
	
	
}
