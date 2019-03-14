package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


import com.db.*;
import com.model.User;

public class UserDAO implements IUserDAO{
	protected static final String FIELDS_INSERT="user_id,ps,name,phone,birth,sex,address";
	protected static String INSERT_SQL="insert into user("+FIELDS_INSERT+") "
			+"values(?,?,?,?,?,?,?)";
	protected static String SELECT_SQL="select "+FIELDS_INSERT
			+" from user where user_id=?";
	protected static String UPDATE_SQL="update user set ps=?,name=?,phone=?,birth=?,sex=?,address=? where user_id=?";
	protected static String DELETE_SQL="delete from user where user_id=?";

	@Override
	public User create(User user) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		try{
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(INSERT_SQL);
			prepStmt.setInt(1, user.getUser_id());
			prepStmt.setString(2, user.getPs());
			prepStmt.setString(3, user.getName());
			prepStmt.setString(4, user.getPhone());
			prepStmt.setDate(5, user.getBirth());
			prepStmt.setString(6, user.getSex());
			prepStmt.setString(7, user.getAdd());
			
			prepStmt.executeUpdate();
		}catch(Exception e){
			
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		return user;
	}

	@Override
	public void remove(User user) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		try {
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(DELETE_SQL);	
		    prepStmt.setInt(1, user.getUser_id());
		    prepStmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		
	}

	@Override
	public User find(int id) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		User user2=null;
		try{
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(SELECT_SQL);
			prepStmt.setInt(1, id);
			rs=prepStmt.executeQuery();
			if(rs!=null)
			if(rs.next()){
				user2=new User();
				user2.setUser_id(rs.getInt(1));
				user2.setPs(rs.getString(2));
				user2.setName(rs.getString(3));
				user2.setPhone(rs.getString(4));
				user2.setBirth(rs.getDate(5));
				user2.setSex(rs.getString(6));
				user2.setAdd(rs.getString(7));
			}
			
		}catch(Exception e){
			//处理异常
			System.out.print("空");
			
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		return user2;
	}

	@Override
	public List<User> findAll() throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		List<User> userList=new ArrayList<User>();
		con=DbCon.getDBcon();
		prepStmt = con.prepareStatement("select * from user");
		rs=prepStmt.executeQuery();
		while(rs.next()){
			User user2=new User();
			user2.setUser_id(rs.getInt(1));
			user2.setPs(rs.getString(2));
			user2.setName(rs.getString(3));	
			user2.setPhone(rs.getString(4));
			
			userList.add(user2);
			
		}
		DbCon.closeDB(con, prepStmt, rs);
		
		return userList;
	}

	@Override
	public void update(User user) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		try {
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(UPDATE_SQL);
			
			prepStmt.setString(1, user.getPs());
			//System.out.println(user.getPs());
			prepStmt.setString(2, user.getName());
		//	System.out.println(user.getName());
			prepStmt.setString(3, user.getPhone());
		//	System.out.println(user.getPhone());
			prepStmt.setDate(4, user.getBirth());
		//	System.out.println(user.getBirth());
			prepStmt.setString(5, user.getSex());
		//	System.out.println(user.getSex());
			prepStmt.setString(6, user.getAdd());
		//	System.out.println(user.getAdd());
			prepStmt.setInt(7, user.getUser_id());
			
			

			
			int rowCount=prepStmt.executeUpdate();
			if(rowCount==0){
				 throw new Exception("更新异常，用户id："+user.getUser_id());
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		
	}

}
