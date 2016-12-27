package com.zlebank.zplatform.member.merchant.bean.enums;

public enum ManagerErro {
	
	PHONEHAVA_100("0001","手机号已存在"),
	/**
	 * 校验类错误
	 * **/
	JIAOYAN_100("0001","企业名称不能为空"),
	/**
	 * 接口异常类错误
	 * **/
	YC_100("0001","生成商户号异常"),
	YC_101("0002","保存商户异常"),
	YC_102("0003","生成主键异常"),
	YC_103("0004","插入merchapply表异常"),
	YC_104("0005","插入memberapply表异常"),
	YC_105("0005","插入企业表异常");
	private String code;
	
	private String message;
	
	

	private ManagerErro(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return "HT-"+code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
