package com.dao;

import java.util.List;
import com.model.Scenery;

public interface ISceneryDAO {
	
	public abstract Scenery find(int s_id) throws Exception;//按景点id查询
	public abstract List<Scenery> findKind(String kind) throws Exception; //按景点类别查询
	public abstract List<Scenery> search(String search) throws Exception; //根据用户输入查询
	public abstract List<Scenery> recommend(int s_id,String key) throws Exception; //按景点推荐
	public abstract List<Scenery> findALL() throws Exception; //输出全部景点
	public abstract void update(Scenery scenery) throws Exception ;//更新景点hot
	
	

}
