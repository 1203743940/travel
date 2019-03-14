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

import java.util.Date;

/**
 * Servlet implementation class Click
 */
public class ClickView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClickView() {
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
		User user = new User();
		user=(User)request.getSession().getAttribute("user");
		Integer id=new Integer(1);
		id=Integer.parseInt(request.getParameter("s_id"));
		System.out.println(id);	
		RequestDispatcher dis=null;
		ISceneryDAO clickDao= new SceneryDAO();
		Scenery scenery =new Scenery();	
		int a = 0;//0表示未收藏
		
		IUActionSDAO checkDAO = new UActionDAO();
		UccS uS = new UccS();
		
		uS.setUser_id(user.getUser_id());
		uS.setS_id(id);		
		//传入时间是否出错？
		uS.setTimeC(new Date());	
		uS.setWhatDo("click");
		
		try {
			checkDAO.createAction(uS);
				//判断是否收藏景点	
			if(checkDAO.check(uS)){
				System.out.println(checkDAO.check(uS));	
				
				a= 1;//表示已收藏
			}else {
				System.out.println(checkDAO.check(uS));	
				a=0;
			}
			scenery=clickDao.find(id);	
			System.out.println(scenery.getS_name());
			System.out.println("a="+a);
			request.setAttribute("state", a);
			request.setAttribute("scenery", scenery);
			dis=request.getRequestDispatcher("scenery.jsp");
			
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dis.forward(request,response);
	}

}
