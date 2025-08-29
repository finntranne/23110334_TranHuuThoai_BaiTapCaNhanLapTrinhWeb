package vn.iostar.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Cookie;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		if (user.equals("cookie") && pass.equals("123")) {
			
			Cookie cookie = new Cookie("username", user);

			cookie.setMaxAge(30);

			resp.addCookie(cookie);

			resp.sendRedirect(req.getContextPath() + "/hello");
		}
		else if(user.equals("session") && pass.equals("123")){
	
			HttpSession session = req.getSession();
			session.setAttribute("username", user);
			resp.sendRedirect(req.getContextPath() + "/profile");
		}
		else {
			resp.sendRedirect(req.getContextPath() + "/login");

		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		 req.getRequestDispatcher("/views/Login.html").forward(req, resp);
	}

}