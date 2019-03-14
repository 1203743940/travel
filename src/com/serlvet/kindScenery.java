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

import org.apache.catalina.tribes.group.InterceptorPayload;

import com.dao.ISceneryDAO;
import com.dao.SceneryDAO;
import com.model.Scenery;
import com.sun.jndi.toolkit.url.Uri;

/**
 * Servlet implementation class kindScenery
 */
public class kindScenery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public kindScenery() {
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
		
		String pg=new String("");
		pg=request.getParameter("page");
		//System.out.println(pg+" ");
		Integer page=new Integer(1);
		
		String search=request.getParameter("kind");
		search = URLEncoder.encode(search, "ISO-8859-1");

		search = URLDecoder.decode(search, "UTF-8");
		request.setAttribute("search", search);
		//System.out.println(search);
		try{
		page=Integer.parseInt(pg);
		}catch (Exception e){
			e.printStackTrace();
		
		}
		System.out.print(search);
		RequestDispatcher dis=null;
		ISceneryDAO searchDao= new SceneryDAO();
		Scenery scenery =new Scenery();
		scenery = null;
		
		
		List<Scenery> searchSonList=new ArrayList<Scenery>();
		
		
		List<Scenery> searchList=new ArrayList<Scenery>();
	
		
		try {
			searchList=searchDao.findKind(search);
			System.out.println(searchList.size());
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
				
				dis=request.getRequestDispatcher("viewTable.jsp");
			
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dis.forward(request,response);
	}

}
