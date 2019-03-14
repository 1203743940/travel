package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



import com.db.DbCon;
import com.model.USearch;
import com.model.User;

public class USearchDAO implements IUSearchDAO {
	
	protected static final String FIELDS_INSERT="user_id,Stime,searchWord";
	protected static String INSERT_SQL="insert into search("+FIELDS_INSERT+") "
			+"values(?,?,?)";
	protected static String SELECT_SQL="select searchWord from search where user_id=? Order By Stime Desc";
	/*protected static String UPDATE_SQL="update user set "
			+"user_id=?,ps=?,name=?,phone=?birth=?,sex=?,add=? where user_id=?";
	protected static String DELETE_SQL="delete from user where user_id=?";*/
	
	
	/*java.util.Date转换形如"yyyy-MM-dd HH:mm:ss"字符串*/
	public static String dateToStr(java.util.Date date) {
	    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String str = sf.format(date);
	    return str;
	}
	
	/*形如"yyyy-MM-dd HH:mm:ss"字符串转换java.sql.Timestamp*/
	public static java.sql.Timestamp strToSqlDate(String strDate) {
	    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    java.util.Date date = null;
	    try {
	            date = sf.parse(strDate);
	    } catch (Exception e) {
	            e.printStackTrace();
	    }
	    java.sql.Timestamp dateTime = new java.sql.Timestamp(date.getTime());
	    return dateTime;
	}

	@Override
	
	public USearch create(USearch uSearch) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		try{
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(INSERT_SQL);
			prepStmt.setInt(1, uSearch.getUser_id());
			//prepStmt.setTimestamp(2, new java.sql.Timestamp(uSearch.getTimeS()));
			prepStmt.setTimestamp(2, strToSqlDate(dateToStr(uSearch.getTimeS())) );
			prepStmt.setString(3, uSearch.getSearchCi());
			
			
			prepStmt.executeUpdate();
		}catch(Exception e){
			 e.printStackTrace();
			return null;
			
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		return uSearch;
		
	}

	@Override
	public List<String> findHistory(int user_id) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		List<String> historyList=new ArrayList<String>();
		try{
		    con=DbCon.getDBcon();
		     prepStmt = con.prepareStatement(SELECT_SQL);
		     rs=prepStmt.executeQuery();
		     while(rs.next()){
			   String history=new String();
			   history=rs.getString(1);
			   
			
			   historyList.add(history);
			   if(historyList.size()>5)//取六个历史记录
				   break;
			
		   }
		}catch(Exception e){
			 e.printStackTrace();
			historyList=null;
			
		}
		finally{DbCon.closeDB(con, prepStmt, rs);}
		
		return historyList;
	}

}
