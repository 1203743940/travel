package com.dao;

import com.model.UccS;
import java.util.List;


public interface IUActionSDAO {
	public abstract UccS createAction(UccS uccS) throws Exception;//�û���� �ղ���Ϊ�����
	public abstract int findClickNum(int s_id) throws Exception;//����������
	public abstract int findCollectNum(int s_id) throws Exception;//�����ղش���
	public abstract void cancleCollect(UccS uccS) throws Exception;//�û�ȡ���ղ���Ϊ
	public abstract Boolean check(UccS uccS) throws Exception;//false���ղظþ��㣬true��ʾ���ղ�
	public abstract List<Integer> findS_id(int id) throws Exception;//�����û��ղصľ���id
	
		
	
	

}
