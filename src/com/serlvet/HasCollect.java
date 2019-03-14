package com.serlvet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ISceneryDAO;
import com.dao.IUActionSDAO;
import com.dao.SceneryDAO;
import com.dao.UActionDAO;
import com.model.Scenery;
import com.model.UccS;
import com.model.User;

/**
 * Servlet implementation class HasCollect
 */
public class HasCollect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HasCollect() {
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
		User user=new User();//当前登陆用户
		user=(User)request.getSession().getAttribute("user");
		RequestDispatcher dis=null;
		
		List<Integer> s_idList = new ArrayList<Integer>();
		UccS uccS= new UccS();
		IUActionSDAO recomDAO= new UActionDAO();
		try {
			
			s_idList= recomDAO.findS_id(user.getUser_id());//用户收藏景点idList
			System.out.println("jindian id长度为"+s_idList.size());	
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		ISceneryDAO sceneryDAO = new SceneryDAO();
		List<Scenery> sceneryList= new ArrayList<Scenery>();//收藏景点列表
		try {
			if(s_idList!=null){
				
				for (int i = 0; i < s_idList.size(); i++) {
					sceneryList.add(sceneryDAO.find(s_idList.get(i)));
				}
				 
				 
			}else{
				sceneryList=null;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

		 
		 System.out.println(sceneryList.size());				
		request.setAttribute("sceneryList", sceneryList);	
		
	    dis=request.getRequestDispatcher("hasCollect.jsp");			
	    dis.forward(request,response);
	}

}
