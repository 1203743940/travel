package com.dao;

import com.model.USearch;


import java.util.List;

public interface IUSearchDAO {
	//public abstract USearch createU（USearch uSearch） throws Exception;
	public abstract USearch create(USearch uSearch)throws Exception;//插入用户搜索记录
	public abstract List<String> findHistory(int user_id) throws Exception;//查询用户搜索历史

}
