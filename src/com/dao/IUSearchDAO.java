package com.dao;

import com.model.USearch;


import java.util.List;

public interface IUSearchDAO {
	//public abstract USearch createU��USearch uSearch�� throws Exception;
	public abstract USearch create(USearch uSearch)throws Exception;//�����û�������¼
	public abstract List<String> findHistory(int user_id) throws Exception;//��ѯ�û�������ʷ

}
