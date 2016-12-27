/* 
 * EnterpriseDetaApplyDAOImpl.java  
 * 
 * version TODO
 *
 * 2016年8月19日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.merchant.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zlebank.zplatform.member.commons.dao.impl.HibernateBaseDAOImpl;
import com.zlebank.zplatform.member.merchant.bean.EnterpriseBean;
import com.zlebank.zplatform.member.merchant.bean.Pages;
import com.zlebank.zplatform.member.merchant.dao.EnterpriseDetaApplyDAO;
import com.zlebank.zplatform.member.merchant.pojo.PojoEnterpriseDetaApply;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月19日 上午9:13:33
 * @since
 */
@Repository("enterpriseDetaApplyDAO")
public class EnterpriseDetaApplyDAOImpl extends HibernateBaseDAOImpl<PojoEnterpriseDetaApply>
		implements EnterpriseDetaApplyDAO {

	@Override
	public void saveMerchApply(PojoEnterpriseDetaApply enterpriseDetaApply) {
		this.saveEntity(enterpriseDetaApply);

	}

	// 查询所有商户信息
	@Override
	@Transactional(readOnly = true)
	public Pages<EnterpriseBean> getAllEnterprise(int page, int size) {

		Pages<EnterpriseBean> pages = new Pages<EnterpriseBean>();
		Session session = this.getSession();
		Criteria criteria = session.createCriteria(PojoEnterpriseDetaApply.class);
		Long rowCount = (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();
		criteria.setFirstResult(page);
		criteria.setMaxResults(size);
		@SuppressWarnings("unchecked")
		List<EnterpriseBean> lists = criteria.list();

		pages.setList(lists);
		pages.setRow(rowCount);
		return null;
	}

	// 根据名字查询商户信息
	@Override
	@Transactional(readOnly = true)
	public PojoEnterpriseDetaApply getEnterpriseByName(String enterName) {

		Criteria criteria = getSession().createCriteria(PojoEnterpriseDetaApply.class);
		criteria.add(Restrictions.eq("enterpriseName", enterName));

		return (PojoEnterpriseDetaApply) criteria.uniqueResult();

	}

	// 根据商户号查询企业信息
	@Override
	@Transactional(readOnly = true)
	public PojoEnterpriseDetaApply getEnterpriseById(String id) {

		Criteria criteria = getSession().createCriteria(PojoEnterpriseDetaApply.class);
		criteria.add(Restrictions.eq("memberId", id));

		return (PojoEnterpriseDetaApply) criteria.uniqueResult();
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteById(String memberId) {

		Session session = getSession();
		Criteria criteria = session.createCriteria(PojoEnterpriseDetaApply.class);
		criteria.add(Restrictions.eq("memberId", memberId));
		PojoEnterpriseDetaApply uniqueResult = (PojoEnterpriseDetaApply) criteria.uniqueResult();
		if (uniqueResult != null) {
			session.delete(uniqueResult);
		}

	}

}
