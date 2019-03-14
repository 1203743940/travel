package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.db.DbCon;
import com.model.Scenery;
import com.model.User;
import com.model.Dice;


public class SceneryDAO implements ISceneryDAO {
	
	protected static final String FIELDS_INSERT=
			"s_id,s_name,level,place,open,introduction,keyword,kind,img,lng,lat,grade,hotnum,comment";
	
	protected static String SELECT_SQL="select "+FIELDS_INSERT
			+" from scenery where s_id=?";
	protected static String SELECT_SQL_KIND="select "+FIELDS_INSERT
			+" from scenery where kind like ?";
	protected static String SELECT_SQL_DICE="select "+FIELDS_INSERT
			+"  from scenery where kind=(select kind from scenery where s_id=? )";
	protected static String SELECT_SQL_SEARCH="select "+FIELDS_INSERT
			+" from scenery where s_name like ? OR introduction like ? OR place like ? Order By hotnum Desc";
	protected static String SELECT_SQL_DICENUM="select "+FIELDS_INSERT
			+"  from scenery where kind=(select kind from scenery where s_id=? )";
	protected static String SELECT_ALL="select "+FIELDS_INSERT
			+" from scenery ";
	protected static String UPDATE_SQL="update scenery set hotnum=? where s_id=?";
	
	
	
	public Float diceNum(String[] s1,String[] s2) {
		float a=0;
		int tong=0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if(s1[i].equals(s2[j]))
					tong++;		
			}	
		}
		a=tong/(s1.length+s2.length);
		return a;
	}
	
	
	

	@Override
	public Scenery find(int s_id) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		Scenery scenery=new Scenery();
		try{
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(SELECT_SQL);
			prepStmt.setInt(1, s_id);
			rs=prepStmt.executeQuery();
			if(rs!=null)
			if(rs.next()){
				//scenery=new Scenery();
				scenery.setS_id(rs.getInt(1));
				scenery.setS_name(rs.getString(2));
				scenery.setLevel(rs.getString(3));
				scenery.setPlace(rs.getString(4));
				scenery.setOpen(rs.getString(5));
				scenery.setIntroduction(rs.getString(6));
				scenery.setKeyword(rs.getString(7));
				scenery.setKind(rs.getString(8));
				scenery.setImg(rs.getString(9));

				scenery.setLng(rs.getFloat(10));
				scenery.setLat(rs.getFloat(11));
				scenery.setGrade(rs.getFloat(12));
				scenery.setHotnum(rs.getFloat(13));
				scenery.setComment(rs.getInt(14));
			}
			
		}catch(Exception e){
			//处理异常
			e.printStackTrace();
			
			
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		return scenery;
	}

	@Override
	public List<Scenery> findKind(String kind) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		List<Scenery> sceneryList=new ArrayList<Scenery>();
		con=DbCon.getDBcon();
		prepStmt = con.prepareStatement(SELECT_SQL_KIND);
		kind="%"+kind+"%";
		System.out.println(kind);
		prepStmt.setString(1, kind);
		rs=prepStmt.executeQuery();
		while(rs.next()){
			Scenery scenery=new Scenery();
			scenery=new Scenery();
			scenery.setS_id(rs.getInt(1));
			scenery.setS_name(rs.getString(2));
			scenery.setLevel(rs.getString(3));
			scenery.setPlace(rs.getString(4));
			scenery.setOpen(rs.getString(5));
			scenery.setIntroduction(rs.getString(6));
			scenery.setKeyword(rs.getString(7));
			scenery.setKind(rs.getString(8));
			scenery.setImg(rs.getString(9));
			
		
			scenery.setLng(rs.getFloat(10));
			scenery.setLat(rs.getFloat(11));
			scenery.setGrade(rs.getFloat(12));
			scenery.setHotnum(rs.getFloat(13));
			scenery.setComment(rs.getInt(14));
			
			sceneryList.add(scenery);
			
		}
		DbCon.closeDB(con, prepStmt, rs);
		
		return sceneryList;
		
	}

	@Override
	public List<Scenery> recommend(int s_id,String key) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		List<Scenery> sceneryList=new ArrayList<Scenery>();
		List<Dice> dices = new ArrayList<Dice>();
		List<Integer> idIntegers = new ArrayList<Integer>();
		con=DbCon.getDBcon();
		

		prepStmt = con.prepareStatement(SELECT_SQL_DICE);
		
		prepStmt.setInt(1, s_id);
		rs=prepStmt.executeQuery();
		while(rs.next()){
			Scenery scenery=new Scenery();
			
			Dice dice = new Dice();
			
			scenery.setS_id(rs.getInt(1));
			scenery.setS_name(rs.getString(2));
			scenery.setLevel(rs.getString(3));
			scenery.setPlace(rs.getString(4));
			scenery.setOpen(rs.getString(5));
			scenery.setIntroduction(rs.getString(6));
			scenery.setKeyword(rs.getString(7));
			scenery.setKind(rs.getString(8));
			scenery.setImg(rs.getString(9));
			scenery.setLng(rs.getFloat(10));
			scenery.setLat(rs.getFloat(11));
			scenery.setGrade(rs.getFloat(12));
			scenery.setHotnum(rs.getFloat(13));
			scenery.setComment(rs.getInt(14));
			
			dice.setS_id(rs.getInt(1));
			float b= diceNum(key.split(","), rs.getString(7).split(","));
			dice.setDice(b);
			dices.add(dice);
			
			//sceneryList.add(scenery);
			
		}
		DbCon.closeDB(con, prepStmt, rs);
		Collections.sort(dices, new Comparator<Dice>() {  
			  
            @Override  
            public int compare(Dice o1, Dice o2) {  
                float a = o2.getDice() - o1.getDice();  
                if(a>=0){
                	return 1;
                }else {
					return -1;
				}
                 
               
            }  
        });  
		//idIntegers.add(dices.get(0).getS_id());
		//idIntegers.add(dices.get(1).getS_id());
		//idIntegers.add(dices.get(2).getS_id());
		
		ISceneryDAO iDao = new SceneryDAO();
		sceneryList.add(iDao.find(dices.get(0).getS_id()));
		sceneryList.add(iDao.find(dices.get(1).getS_id()));
		sceneryList.add(iDao.find(dices.get(2).getS_id()));
		sceneryList.add(iDao.find(dices.get(3).getS_id()));
         
		return sceneryList;


		
		
	}

	@Override
	public List<Scenery> search(String search) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("呵呵  有问题1111");
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		List<Scenery> sceneryList=new ArrayList<Scenery>();
		con=DbCon.getDBcon();
		prepStmt = con.prepareStatement(SELECT_SQL_SEARCH);
		search="%"+search+"%";
		prepStmt.setString(1, search);
		prepStmt.setString(2, search);
		prepStmt.setString(3, search);
		rs=prepStmt.executeQuery();
		while(rs.next()){
			Scenery scenery=new Scenery();
			scenery=new Scenery();
			scenery.setS_id(rs.getInt(1));
			scenery.setS_name(rs.getString(2));
			scenery.setLevel(rs.getString(3));
			scenery.setPlace(rs.getString(4));
			scenery.setOpen(rs.getString(5));
			scenery.setIntroduction(rs.getString(6));
			scenery.setKeyword(rs.getString(7));
			scenery.setKind(rs.getString(8));
			scenery.setImg(rs.getString(9));
			
		
			scenery.setLng(rs.getFloat(10));
			scenery.setLat(rs.getFloat(11));
			scenery.setGrade(rs.getFloat(12));
			scenery.setHotnum(rs.getFloat(13));
			scenery.setComment(rs.getInt(14));
			
			sceneryList.add(scenery);
			
		}
		DbCon.closeDB(con, prepStmt, rs);
		
		return sceneryList;
		
		
	}




	@Override
	public void update(Scenery scenery) throws Exception {
		// TODO Auto-generated method stub
		IUActionSDAO actionSDAO = new UActionDAO();
		int a= actionSDAO.findClickNum(scenery.getS_id());
		int b= actionSDAO.findCollectNum(scenery.getS_id());
		if(a>=10000) a=10000;
		if(b>=1000) b=1000;
	    float c= (scenery.getHotnum()+a/200+b/20)/2;
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		try {
			con=DbCon.getDBcon();
			prepStmt=con.prepareStatement(UPDATE_SQL);			
			prepStmt.setFloat(1, c);	
			prepStmt.setInt(2, scenery.getS_id());			
			int rowCount=prepStmt.executeUpdate();
			if(rowCount==0){
				 throw new Exception("更新异常，景点："+scenery.getS_name());
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			DbCon.closeDB(con, prepStmt, rs);
		}
		
	}




	@Override
	public List<Scenery> findALL() throws Exception {
		// TODO Auto-generated method stub
		
		Connection con=null;
		PreparedStatement prepStmt =null;
		ResultSet rs=null;
		List<Scenery> sceneryList=new ArrayList<Scenery>();
		con=DbCon.getDBcon();
		prepStmt = con.prepareStatement(SELECT_ALL);
		
		rs=prepStmt.executeQuery();
		while(rs.next()){
			Scenery scenery=new Scenery();
			scenery=new Scenery();
			scenery.setS_id(rs.getInt(1));
			scenery.setS_name(rs.getString(2));
			scenery.setLevel(rs.getString(3));
			scenery.setPlace(rs.getString(4));
			scenery.setOpen(rs.getString(5));
			scenery.setIntroduction(rs.getString(6));
			scenery.setKeyword(rs.getString(7));
			scenery.setKind(rs.getString(8));
			scenery.setImg(rs.getString(9));	
			scenery.setLng(rs.getFloat(10));
			scenery.setLat(rs.getFloat(11));
			scenery.setGrade(rs.getFloat(12));
			scenery.setHotnum(rs.getFloat(13));
			scenery.setComment(rs.getInt(14));
			
			sceneryList.add(scenery);
			
		}
		DbCon.closeDB(con, prepStmt, rs);
		
		return sceneryList;
	}

}
