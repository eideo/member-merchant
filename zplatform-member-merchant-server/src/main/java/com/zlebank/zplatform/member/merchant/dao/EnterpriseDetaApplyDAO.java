/* 
 * EnterpriseDetaApplyDAO.java  
 * 
 * version TODO
 *
 * 2016年8月19日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.merchant.dao;

import com.zlebank.zplatform.member.commons.dao.BaseDAO;
import com.zlebank.zplatform.member.merchant.bean.EnterpriseBean;
import com.zlebank.zplatform.member.merchant.bean.Pages;
import com.zlebank.zplatform.member.merchant.pojo.PojoEnterpriseDetaApply;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月19日 上午9:11:06
 * @since 
 */
public interface EnterpriseDetaApplyDAO extends BaseDAO<PojoEnterpriseDetaApply>{

	//保存信息到T_ENTERPRISE_DETA_APPLY里面
	void saveMerchApply(PojoEnterpriseDetaApply enterpriseDetaApply);
	
	//查询所有企业信息
	Pages<EnterpriseBean> getAllEnterprise(int page, int size);
	//根据企业名称查询企业信息
	PojoEnterpriseDetaApply getEnterpriseByName(String enterName);
	//根据商户号查询企业信息
	PojoEnterpriseDetaApply getEnterpriseById(String id);
	
	//根据商户号删除企业信息
	void deleteById(String memberId);
	
}
