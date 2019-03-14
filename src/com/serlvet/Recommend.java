package com.serlvet;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;

import com.dao.ISceneryDAO;
import com.dao.IUActionSDAO;
import com.dao.SceneryDAO;
import com.dao.UActionDAO;
import com.model.Scenery;
import com.model.UccS;
import com.model.User;

/**
 * Servlet implementation class Recommend
 */
public class Recommend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Recommend() {
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
		List<Scenery> sceneryList= new ArrayList<Scenery>();//推荐景点列表
		try {
			if(s_idList!=null){
				
				for (int i = 0; i < s_idList.size(); i++) {
					sceneryList.addAll(sceneryDAO.recommend
							(s_idList.get(i),sceneryDAO.find(s_idList.get(i)).getKeyword()));
					if(i>1) break;
				}
				 
				 
			}else{
				
				dis=request.getRequestDispatcher("index.jsp");			
			    dis.forward(request,response);
			    return ;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
        for (int i = 0; i<sceneryList.size()-1;i++) {
        	for (int j = i+1; j < sceneryList.size(); j++) {
        		if(sceneryList.get(i).getS_id()==sceneryList.get(j).getS_id()){
        			sceneryList.remove(j);
        		}
        			
				
			}
			
		}
		System.out.println(sceneryList.size());				
		request.setAttribute("sceneryList", sceneryList);	
		
	    dis=request.getRequestDispatcher("recommend.jsp");			
	    dis.forward(request,response);
		}

}
