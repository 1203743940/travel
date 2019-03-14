package com.serlvet;

import java.awt.print.Printable;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.naming.java.javaURLContextFactory;

import com.dao.IUserDAO;
import com.dao.UserDAO;
import com.model.User;

/**
 * Servlet implementation class Info
 */
public class Info extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Info() {
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
		
		
	    int userId=Integer.parseInt(request.getParameter( "userId" ));
		
		
		String name=request.getParameter("name");
		
		
		String phone=request.getParameter("phone");	
		
		String province=request.getParameter("province");
		String city=request.getParameter("city");
		String ps=request.getParameter("passwordNew");
		
		String birth=request.getParameter("birth");
		System.out.println(birth+"空的");
		
		String sex=request.getParameter("sex");
		
		        
		
		java.sql.Date date = null;    		               	            
		// String转Date    
		      
		try {    
			 date=java.sql.Date.valueOf(birth);   
		          
		} catch (Exception e) {    
		           e.printStackTrace(); 
		           date=null;
		}  
		
		String add=province+city;
		
		
		
		IUserDAO infoDAO= new UserDAO();
		
		try{
			User user=infoDAO.find(userId);	
		//	System.out.println(name);
		//	System.out.println(user.getName());
			if(name.equals("")==false) user.setName(name);
			try{
				if(date.equals("")==false) user.setBirth(date);
				}catch(Exception e){e.printStackTrace();}
			if(ps.equals("")==false) user.setPs(ps);
			if(add.equals("")==false) user.setAdd(add);
			if(phone.equals("")==false) user.setPhone(phone);
			if(sex.equals("")==false) user.setSex(sex);
		//	System.out.println(user.getName());
			
			infoDAO.update(user);//修改用户
		//	System.out.println(user.getName());
		//	System.out.println(infoDAO.find(userId).getName());
			
			
			request.getSession().setAttribute("user", user);
			response.sendRedirect("login/info.jsp");			
			}	catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}

}
