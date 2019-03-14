package com.dao;

import java.util.List;
import com.model.User;


public interface IUserDAO {
	public abstract User create(User user)throws Exception;//����û�
	public abstract void remove(User user)throws Exception;//ɾ���û�
	public abstract User find(int id)throws Exception;//��ѯ�û�id 
	public abstract List<User> findAll()throws Exception;//�г�ȫ����¼
	public abstract void update(User user)throws Exception;//�޸��û�
	
}
