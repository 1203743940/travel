package com.serlvet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.undo.StateEdit;

import com.dao.IUserDAO;
import com.dao.UserDAO;
import com.model.User;


/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
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
		request.setCharacterEncoding("utf-8");
	    int id=Integer.parseInt(request.getParameter("user_id"));
		String ps=request.getParameter("password");
		//int id=1;
		//String ps="481147";
		System.out.print(id+"|"+ps);
		RequestDispatcher dis=null;
		IUserDAO loginDao= new UserDAO();
		User user = new User();
		//user = null;
		String state = new String();
		user.setUser_id(id);
		user.setPs(ps);
		user.setBirth(null);
		user.setSex("ÄÐ");
		user.setAdd(null);
		user.setPhone(null);
		

		try {
			if(loginDao.find(id)== null){
				loginDao.create(user);
				user=loginDao.find(id);
				System.out.print(user.getUser_id());
				request.getSession().setAttribute("user", user);
				
				response.sendRedirect("login/info.jsp");
				
				//dis=request.getRequestDispatcher("login/contact.html");
			}else {
				//state="2";
				//request.setAttribute("state", state);
				
				//dis=request.getRequestDispatcher("login/login.jsp");
				response.sendRedirect("login/login.jsp?state=2");
				//dis.forward(request,response);
			}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	dis.forward(request,response);
	}

}
