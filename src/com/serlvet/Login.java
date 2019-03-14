package com.serlvet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

import com.db.*;
import com.dao.*;
import com.model.User;


/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("23332|ÊÇ·ñ");
		request.setCharacterEncoding("utf-8");
	    int id=Integer.parseInt(request.getParameter("userId"));
		String ps=request.getParameter("password");
		//int id=1;
		//String ps="481147";
		System.out.print(id+"|"+ps);
		RequestDispatcher dis=null;
		IUserDAO loginDao= new UserDAO();
		User user = new User();
		user = null;
		String  state= new String();

		try {
			if(loginDao.find(id).getPs().equals(ps)==true){
				user=loginDao.find(id);
				System.out.print(user.toString());
				request.getSession().setAttribute("user", user);
				
				response.sendRedirect("login/info.jsp");
				
				//dis=request.getRequestDispatcher("login/contact.html");
			}else {
				//state="0";
				//request.setAttribute("state",state);
				//dis=request.getRequestDispatcher("login/login.jsp");
			//	dis.forward(request,response);
				response.sendRedirect("login/login.jsp?state=0");
			}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	dis.forward(request,response);
	
	}

}
