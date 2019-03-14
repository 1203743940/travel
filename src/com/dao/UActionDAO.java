package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.db.DbCon;
import com.model.Scenery;
import com.model.UccS;

public class UActionDAO  implements IUActionSDAO {
	protected static final String FIELDS_INSERT="user_id,s_id,time,whatdo";
	protected static String INSERT_SQL="insert into action("+FIELDS_INSERT+") values(?,?,?,?)";
	protected static String SELECT_CLICK_SQL="select count(*) from action where s_id=? and whatdo='click'";
	protected static String SELECT_COLLECT_SQL="select count(*) from action where s_id=? and whatdo='collect'";
	protected static String DELETE_SQL="delete from action where user_id=? and s_id=? and whatdo='collect'";
	protected static String CHECK_SQL="select user_id from action where user_id=? and s_id=? and whatdo='collect'";
	protected static String SELECT_SCENERY_SQL="select s_id from action where user_id=? and whatdo='collect' Order By time Desc ";
	
	int clickNum=0;
	int collectNum=0;
	//int s_id;
	
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
	public UccS createAction(UccS uccS) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		try{
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(INSERT_SQL);
			prepStmt.setInt(1, uccS.getUser_id());
			prepStmt.setInt(2, uccS.getS_id());
			prepStmt.setTimestamp(3, strToSqlDate(dateToStr(uccS.getTimeC())) );
			prepStmt.setString(4, uccS.getWhatDo());
			prepStmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		return uccS;
		
		
	}

	@Override
	public int findClickNum(int s_id) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		Scenery scenery=null;
		try{
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(SELECT_CLICK_SQL);
			prepStmt.setInt(1, s_id);
			rs=prepStmt.executeQuery();
			if(rs!=null)
			while(rs.next()){
				clickNum=rs.getInt(1);
			}
			
		}catch(Exception e){
			e.printStackTrace();
			//处理异常
			System.out.print("空");
			
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		return clickNum;
		
		
	}

	@Override
	public int findCollectNum(int s_id) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		Scenery scenery=null;
		try{
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(SELECT_COLLECT_SQL);
			prepStmt.setInt(1, s_id);
			rs=prepStmt.executeQuery();
			if(rs!=null)
			if(rs.next()){
				collectNum=rs.getInt(1);
			}
			
		}catch(Exception e){
			e.printStackTrace();
			//处理异常
			System.out.print("空");
			
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		return collectNum;
		
		
	}

	@Override
	public void cancleCollect(UccS uccS) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		Scenery scenery=null;
		try{
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(DELETE_SQL);
			prepStmt.setInt(1, uccS.getUser_id());
			prepStmt.setInt(2, uccS.getS_id());
			
			prepStmt.executeUpdate();
			
			
		}catch(Exception e){
			e.printStackTrace();
			//处理异常
			
			
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		
	}

	@Override
	public Boolean check(UccS uccS) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		Scenery scenery=null;
		try{
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(CHECK_SQL);
			prepStmt.setInt(1, uccS.getUser_id());
			prepStmt.setInt(2, uccS.getS_id());
			rs=prepStmt.executeQuery();
			if(rs!=null){
				if(rs.next()){
					
					System.out.println("已收藏");
					return true;
				}
				
				return false;			    
			}else {
				
				System.out.println("未收藏");
				return false;
				
			}	
			
		}catch(Exception e){
			e.printStackTrace();
			//处理异常
			System.out.print("空");
			
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		
		return false;
	}

	@Override
	public List<Integer> findS_id(int id) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		Scenery scenery=null;
		List<Integer> idList= new ArrayList<Integer>();
		int s_id =0;
		try{
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(SELECT_SCENERY_SQL);
			prepStmt.setInt(1, id);
			
			
			rs=prepStmt.executeQuery();
			if(rs!=null){
				while(rs.next()){
					s_id=rs.getInt("s_id");
					idList.add(s_id);
					
				    }
			}else{
					idList=null;
			}
				
			
		}catch(Exception e){
			e.printStackTrace();
			//处理异常
			System.out.print("空");
			
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		System.out.println("经典长度为"+idList.size());
		return idList;
	}

}
