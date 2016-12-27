package com.zlebank.zplatform.member.merchant.dao;

import com.zlebank.zplatform.member.commons.dao.BaseDAO;
import com.zlebank.zplatform.member.merchant.bean.Pages;
import com.zlebank.zplatform.member.merchant.pojo.PojoMerchDetaApply;

/**
 * 对表apply操作
 * 
 * **/
public interface ManagerMerchApplyDao extends BaseDAO<PojoMerchDetaApply>{
	
	//新增
	void setNetmember(PojoMerchDetaApply merchDetaApply);

	PojoMerchDetaApply selectMerchById(String merchId);

	Pages<PojoMerchDetaApply> selectAll(int page,int size);
 
	void delectById(String memberId);
 
	
}
