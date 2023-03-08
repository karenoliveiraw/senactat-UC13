package hello;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Hello() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter(); // essa linha gera o código em html
		/**
		 * estrutura do código em html
		 */
		out.println("<!Doctype html>"); 
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Hello Servlet </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("</body>");
		out.println("<h1> Hello Servlet </h1>");
		out.println("Karen Oliveira");
		out.println("</html>");
	}

}
