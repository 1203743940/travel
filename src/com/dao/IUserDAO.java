package com.dao;

import java.util.List;
import com.model.User;


public interface IUserDAO {
	public abstract User create(User user)throws Exception;//添加用户
	public abstract void remove(User user)throws Exception;//删除用户
	public abstract User find(int id)throws Exception;//查询用户id 
	public abstract List<User> findAll()throws Exception;//列出全部记录
	public abstract void update(User user)throws Exception;//修改用户
	
}
