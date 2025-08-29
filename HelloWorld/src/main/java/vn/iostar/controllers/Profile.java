package vn.iostar.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = { "/profile" })
public class Profile extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		HttpSession session = req.getSession(false);
		if (session != null) {
			String name = (String) session.getAttribute("username");
			printWriter.println("Chào bạn, " + name + " đã login bằng Session");
		} else {
			resp.sendRedirect("/HelloServlet/Login.html");
		}

	}

}
