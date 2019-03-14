package com.db;

import java.sql.*;

public class DbCon {
	private static String dbName="travel";
	
	private static String user="root";
	private static String password="mm481147";
	public static Connection getDBcon(){
		String url="jdbc:mysql://localhost:3306/"+dbName+"?characterEncoding=utf8&useSSL=true";
	    try{
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection con=DriverManager.getConnection(url,user,password);
		    return con;

	     }catch(Exception e){
		     e.printStackTrace();
	     }
		 return null;
	     
	}
	public static void closeDB(Connection con,PreparedStatement pstm,ResultSet rs){
		try{
			if(rs!=null) rs.close();
			if(pstm!=null) pstm.close();
			if(con!=null) con.close();
		}catch(SQLException e){
			e.printStackTrace();
			
		}
	}

}

