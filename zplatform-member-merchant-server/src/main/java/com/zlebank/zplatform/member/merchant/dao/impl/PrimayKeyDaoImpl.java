package com.zlebank.zplatform.member.merchant.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zlebank.zplatform.member.commons.dao.impl.HibernateBaseDAOImpl;
import com.zlebank.zplatform.member.merchant.dao.PrimayKeyDao;
import com.zlebank.zplatform.member.merchant.pojo.PojoPrimayKey;
@Repository
public class PrimayKeyDaoImpl extends HibernateBaseDAOImpl<PojoPrimayKey> implements PrimayKeyDao{

	@Override
	@Transactional(readOnly=false)
	public PojoPrimayKey getNextID(String keyname) {
		 Criteria  criteria = getSession().createCriteria(PojoPrimayKey.class);
		 criteria.add(Restrictions.eq("keyname", keyname));
		return (PojoPrimayKey)criteria.uniqueResult();
	}

	@Override
	@Transactional(readOnly=false)
	public void updateNest(long nextId, long increment,String keyname) {
		Criteria  criteria = getSession().createCriteria(PojoPrimayKey.class);
		criteria.add(Restrictions.eq("keyname", keyname));
		PojoPrimayKey uniqueResult = (PojoPrimayKey) criteria.uniqueResult();
		uniqueResult.setNextId(nextId + increment);
		getSession().update(uniqueResult);
		
	}

}
