/* 
 * PojoMerchDeta.java  
 * 
 * version TODO
 *
 * 2015年9月7日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.merchant.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.zlebank.zplatform.acc.pojo.Money;

/**
 * 
 * Merchant Entity.Copy from zplatform-infrastructure/member
 *
 * @author yangying
 * @version
 * @date 2016年3月4日 上午10:26:31
 * @since 1.3.0
 */
@Entity
@Table(name = "T_MERCH_DETA_APPLY")
public class PojoMerchDetaApply implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4085515656084246454L;
	/** 主键 **/
	private long selfId;
	/** 在用会员表主键 **/
	private Long merchId;
	/*
	 * 会员外键 private String memberApply;
	 */
	/** 外键 **/
	private long memId;
	/** 会员号 **/
	private String memberId;
	/** 上级商户 **/
	private String parent;
	/** 清算周期 **/
	private Long setlCycle;
	/** 清算类型 **/
	private String setlType;
	/** 结算行号 **/
	private String bankCode;
	/** 开户行号 **/
	private String bankNode;
	/** 开户账号 **/
	private String accNum;
	/** 开户名 **/
	private String accName;
	/** 服务费 **/
	private Money charge;
	/** 保证金 **/
	private Money deposit;
	/** 合约开始日期 **/
	private Date agreemtStart;
	/** 合约终止日期 **/
	private Date agreemtEnd;
	/** 产品代码 **/
	private String prdtVer;
	/** 扣率版本 **/
	private String feeVer;
	/** 分润版本 **/
	private String spiltVer;
	/** 风控版本 **/
	private String riskVer;
	/** 路由版本 **/
	private String routVer;
	/** 状态 **/
	private String merchStatus;
	/** 写入人 **/
	private Long mInUser;
	/** 写入时间 **/
	private Date mInTime;
	/** 初审人 **/
	private Long stexaUser;
	/** 初审时间 **/
	private Date stexaTime;
	/** 初审意见 **/
	private String stexaOpt;
	/** 复核人 **/
	private Long cvlexaUser;
	/** 复核时间 **/
	private Date cvlexaTime;
	/** 复核意见 **/
	private String cvlexaOpt;
	/** 备注 **/
	private String notes;
	/** 备注 **/
	private String remarks;
	/** 商户类型 00-代理商户 01-代理商户下的子商户 02-普通商户 **/
	private String merchType;
	/** 所属代理商户id **/
	private Long parentMerchId;
	/** 账户类型 00-对公户 01-对私户 **/
	private String accountType;

	@Id
	@Column(name = "SELF_ID")
	public long getSelfId() {
		return selfId;
	}

	public void setSelfId(long selfId) {
		this.selfId = selfId;
	}

	@Column(name = "MEM_ID")
	public long getMemId() {
		return memId;
	}

	public void setMemId(long memId) {
		this.memId = memId;
	}

	@Column(name = "MERCH_ID")
	public Long getMerchId() {
		return merchId;
	}

	public void setMerchId(Long merchId) {
		this.merchId = merchId;
	}

	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name="SELF_ID") public PojoMemberApply getMemberApply() {
	 * return memberApply; } public void setMemberApply(PojoMemberApply
	 * memberApply) { this.memberApply = memberApply; }
	 */
	@Column(name = "MEMBER_ID")
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	@Column(name = "PARENT")
	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	@Column(name = "SETL_CYCLE")
	public Long getSetlCycle() {
		return setlCycle;
	}

	public void setSetlCycle(Long setlCycle) {
		this.setlCycle = setlCycle;
	}

	@Column(name = "SETL_TYPE")
	public String getSetlType() {
		return setlType;
	}

	public void setSetlType(String setlType) {
		this.setlType = setlType;
	}

	@Column(name = "BANK_CODE")
	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	@Column(name = "BANK_NODE")
	public String getBankNode() {
		return bankNode;
	}

	public void setBankNode(String bankNode) {
		this.bankNode = bankNode;
	}

	@Column(name = "ACC_NUM")
	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	@Column(name = "ACC_NAME")
	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "amount", column = @Column(name = "CHARGE")) })
	public Money getCharge() {
		return charge;
	}

	public void setCharge(Money charge) {
		this.charge = charge;
	}

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "amount", column = @Column(name = "DEPOSIT")) })
	public Money getDeposit() {
		return deposit;
	}

	public void setDeposit(Money deposit) {
		this.deposit = deposit;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "AGREEMT_START")
	public Date getAgreemtStart() {
		return agreemtStart;
	}

	public void setAgreemtStart(Date agreemtStart) {
		this.agreemtStart = agreemtStart;
	}

	@Column(name = "AGREEMT_END")
	public Date getAgreemtEnd() {
		return agreemtEnd;
	}

	public void setAgreemtEnd(Date agreemtEnd) {
		this.agreemtEnd = agreemtEnd;
	}

	@Column(name = "PRDT_VER")
	public String getPrdtVer() {
		return prdtVer;
	}

	public void setPrdtVer(String prdtVer) {
		this.prdtVer = prdtVer;
	}

	@Column(name = "FEE_VER")
	public String getFeeVer() {
		return feeVer;
	}

	public void setFeeVer(String feeVer) {
		this.feeVer = feeVer;
	}

	@Column(name = "SPILT_VER")
	public String getSpiltVer() {
		return spiltVer;
	}

	public void setSpiltVer(String spiltVer) {
		this.spiltVer = spiltVer;
	}

	@Column(name = "RISK_VER")
	public String getRiskVer() {
		return riskVer;
	}

	public void setRiskVer(String riskVer) {
		this.riskVer = riskVer;
	}

	@Column(name = "ROUT_VER")
	public String getRoutVer() {
		return routVer;
	}

	public void setRoutVer(String routVer) {
		this.routVer = routVer;
	}

	@Column(name = "IN_USER")
	public Long getmInUser() {
		return mInUser;
	}

	public void setmInUser(Long mInUser) {
		this.mInUser = mInUser;
	}

	@Column(name = "IN_TIME")
	public Date getmInTime() {
		return mInTime;
	}

	public void setmInTime(Date mInTime) {
		this.mInTime = mInTime;
	}

	@Column(name = "STEXA_USER")
	public Long getStexaUser() {
		return stexaUser;
	}

	public void setStexaUser(Long stexaUser) {
		this.stexaUser = stexaUser;
	}

	@Column(name = "STEXA_TIME")
	public Date getStexaTime() {
		return stexaTime;
	}

	public void setStexaTime(Date stexaTime) {
		this.stexaTime = stexaTime;
	}

	@Column(name = "STEXA_OPT")
	public String getStexaOpt() {
		return stexaOpt;
	}

	public void setStexaOpt(String stexaOpt) {
		this.stexaOpt = stexaOpt;
	}

	@Column(name = "CVLEXA_USER")
	public Long getCvlexaUser() {
		return cvlexaUser;
	}

	public void setCvlexaUser(Long cvlexaUser) {
		this.cvlexaUser = cvlexaUser;
	}

	@Column(name = "CVLEXA_TIME")
	public Date getCvlexaTime() {
		return cvlexaTime;
	}

	public void setCvlexaTime(Date cvlexaTime) {
		this.cvlexaTime = cvlexaTime;
	}

	@Column(name = "CVLEXA_OPT")
	public String getCvlexaOpt() {
		return cvlexaOpt;
	}

	public void setCvlexaOpt(String cvlexaOpt) {
		this.cvlexaOpt = cvlexaOpt;
	}

	@Column(name = "NOTES")
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "REMARKS")
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "MERCHTYPE")
	public String getMerchType() {
		return merchType;
	}

	public void setMerchType(String merchType) {
		this.merchType = merchType;
	}

	@Column(name = "PARENT_MERCHID")
	public Long getParentMerchId() {
		return parentMerchId;
	}

	public void setParentMerchId(Long parentMerchId) {
		this.parentMerchId = parentMerchId;
	}

	@Column(name = "ACCOUNT_TYPE")
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Column(name = "STATUS")
	public String getMerchStatus() {
		return merchStatus;
	}

	public void setMerchStatus(String merchStatus) {
		this.merchStatus = merchStatus;
	}


}
