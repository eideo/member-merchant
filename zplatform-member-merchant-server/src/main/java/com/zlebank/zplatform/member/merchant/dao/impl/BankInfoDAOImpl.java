/* 
 * BankInfoDAOImpl.java  
 * 
 * version v1.0
 *
 * 2015年9月18日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.merchant.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.zlebank.zplatform.member.commons.dao.impl.HibernateBaseDAOImpl;
import com.zlebank.zplatform.member.merchant.dao.BankInfoDAO;
import com.zlebank.zplatform.member.merchant.pojo.PojoBankInfo;

/**
 * Class Description
 *
 * @author Luxiaoshuai
 * @version
 * @date 2015年9月18日 下午3:48:40
 * @since 
 */
@Repository
public class BankInfoDAOImpl   extends HibernateBaseDAOImpl<PojoBankInfo>implements BankInfoDAO {

    /**
     *通过银行代码得到银行信息
     * @param bankCode
     * @return
     */
    @Override
    public PojoBankInfo getByBankNode(String bankCode) {
        Criteria crite= getSession().createCriteria(PojoBankInfo.class);
        crite.add(Restrictions.eq("bankNode", bankCode));
        PojoBankInfo pojo = (PojoBankInfo) crite.uniqueResult();
        return pojo;
    }

    /**
     * 通过银行支行名称得到银行信息
     * @param bankName
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<PojoBankInfo> getByBankName(String bankName, int size) {
        Criteria crite = commonCriteria(bankName);
        crite.setMaxResults(size);
        return crite.list();
    }
    /**
     * 通过银行支行名称得到银行信息条数
     * @param bankName
     * @return
     */
    @Override
    public long getByBankNameCount(String bankName) {
        Criteria crite = commonCriteria(bankName);
        crite.setProjection(Projections.rowCount());
        long  size = (Long) crite.uniqueResult();
        return size;
    }
    
    private Criteria commonCriteria(String bankName) {
        Criteria crite= getSession().createCriteria(PojoBankInfo.class);
        crite.add(Restrictions.like("bankName", "%"+bankName+"%"));
        return crite;
    }
}
