package com.zlebank.zplatform.member.merchant.dao;

import com.zlebank.zplatform.member.commons.dao.BaseDAO;
import com.zlebank.zplatform.member.merchant.pojo.PojoPrimayKey;

public interface PrimayKeyDao extends BaseDAO<PojoPrimayKey>{

	/**
	 * 
	 * 查询主键值
	 * **/
	PojoPrimayKey getNextID(String keyname);
	
	/**
	 * 
	 * 更新主键
	 * 
	 * **/
	void updateNest(long nextId,long increment,String keyname);
}
