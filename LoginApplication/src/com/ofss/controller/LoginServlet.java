package com.ofss.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ofss.model.UsersCredentials;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Just a line test 2nd build ");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname"); // variable name in Login.html
		String pass=request.getParameter("pass");// variable name in Login.html
		boolean isValidUser=UsersCredentials.validteUser(uname, pass);
		// if true, route to success.jsp or failure.jsp
		PrintWriter pw=response.getWriter();	
		if (isValidUser)
		{
			pw.println("Success");
//			request.getRequestDispatcher("success.jsp").forward(request, response);
		}
		else
		{
			pw.println("Failure");
//			request.getRequestDispatcher("failure.jsp").forward(request, response);
		}
		
	}

}
