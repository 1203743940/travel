package com.serlvet;

import java.awt.print.Pageable;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ISceneryDAO;
import com.dao.IUSearchDAO;
import com.dao.IUserDAO;
import com.dao.SceneryDAO;
import com.dao.USearchDAO;
import com.dao.UserDAO;
import com.model.Scenery;
import com.model.USearch;
import com.model.UccS;
import com.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;


/**
 * Servlet implementation class SearchView
 * 用户搜素景点
 */
public class SearchView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchView() {
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
		
		int page=1;
		
		String search=request.getParameter("search");
		search = URLEncoder.encode(search, "ISO-8859-1");
		search = URLDecoder.decode(search, "UTF-8");
		request.setAttribute("search", search);
		
		System.out.print(search);
		page=Integer.parseInt(request.getParameter("page"));
		
	
		RequestDispatcher dis=null;		
		ISceneryDAO searchDao= new SceneryDAO();
		Scenery scenery =new Scenery();
		scenery = null;
		
		
		List<Scenery> searchSonList=new ArrayList<Scenery>();		
		List<Scenery> searchList=new ArrayList<Scenery>();
		
		User user = new User();
		user=(User)request.getSession().getAttribute("user");
		
		IUSearchDAO sDao = new USearchDAO();
		//点击行为的添加
		if(user!=null){
            USearch uS = new USearch();
		    uS.setUser_id(user.getUser_id());
		   
		    //传入时间是否出错？
		    uS.setTimeS(new Date());	
		    uS.setSearchCi(search);
		    try {
		    	sDao.create(uS);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		try {
			searchList=searchDao.search(search);
			
			System.out.println("长度为:"+searchList.size());
			if(page*10<=searchList.size()){
	
				for(int i=(page-1)*10;i<page*10;i++){
					Scenery sc=searchList.get(i);
					 searchSonList.add(sc);
		         }
			
			   
			}else {
				for(int i=(page-1)*10;i<searchList.size();i++){
					searchSonList.add(searchList.get(i));					   
			    }
			}
				//request.getSession().setAttribute("searchSonList", searchSonList);
			   System.out.println(searchSonList.size());
			  
				request.setAttribute("searchSonList", searchSonList);
				request.setAttribute("page", page);
				
				request.setAttribute("searchList", searchList);
				
				//response.sendRedirect("viewTable.jsp");
				
				dis=request.getRequestDispatcher("viewIndex.jsp");
			
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dis.forward(request,response);
	}

}
