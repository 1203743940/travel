package com.dao;

import com.model.UccS;
import java.util.List;


public interface IUActionSDAO {
	public abstract UccS createAction(UccS uccS) throws Exception;//用户点击 收藏行为的添加
	public abstract int findClickNum(int s_id) throws Exception;//景点点击次数
	public abstract int findCollectNum(int s_id) throws Exception;//景点收藏次数
	public abstract void cancleCollect(UccS uccS) throws Exception;//用户取消收藏行为
	public abstract Boolean check(UccS uccS) throws Exception;//false则收藏该景点，true表示已收藏
	public abstract List<Integer> findS_id(int id) throws Exception;//返回用户收藏的景点id
	
		
	
	

}
