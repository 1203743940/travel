package com.serlvet;

import java.io.IOException;

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

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Servlet implementation class Collect
 */
public class Collect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Collect() {
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
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		
		int id=Integer.parseInt(request.getParameter("id"));
		int s_id=Integer.parseInt(request.getParameter("s_id"));
		int a=0;
		String collectState = new String ();
		
		UccS uccS=new UccS();
		uccS.setS_id(s_id);
		uccS.setUser_id(id);
		
		//传入时间是否出错？
		uccS.setTimeC(new Date());
		
		uccS.setWhatDo("collect");
		
		
		
		RequestDispatcher dis=null;
		IUActionSDAO collectDAO= new UActionDAO();
		
		ISceneryDAO clickDao= new SceneryDAO();
		Scenery scenery =new Scenery();
		
		
		//Scenery scenery =new Scenery();
		//scenery = null;
		
		try {
			if(collectDAO.check(uccS)==false){//判断是否收藏，false则没有收藏
				
				collectDAO.createAction(uccS);		
				collectState = "1";
				a=1;
			}else{
				collectDAO.cancleCollect(uccS);
				collectState = "2";
				a=0;
				
			}			
			    scenery=clickDao.find(s_id);
			    System.out.println("a="+a);
			    
			    request.setAttribute("state", a);
				request.setAttribute("scenery", scenery);
				request.setAttribute("collectState", collectState);
				
				
				//response.sendRedirect("viewTable.jsp");
				
				dis=request.getRequestDispatcher("scenery.jsp");
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dis.forward(request,response);
	}

}
