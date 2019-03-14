package com.dao;

import java.util.List;
import com.model.Scenery;

public interface ISceneryDAO {
	
	public abstract Scenery find(int s_id) throws Exception;//������id��ѯ
	public abstract List<Scenery> findKind(String kind) throws Exception; //����������ѯ
	public abstract List<Scenery> search(String search) throws Exception; //�����û������ѯ
	public abstract List<Scenery> recommend(int s_id,String key) throws Exception; //�������Ƽ�
	public abstract List<Scenery> findALL() throws Exception; //���ȫ������
	public abstract void update(Scenery scenery) throws Exception ;//���¾���hot
	
	

}
