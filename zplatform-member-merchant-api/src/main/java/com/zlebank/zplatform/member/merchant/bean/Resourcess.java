package com.zlebank.zplatform.member.merchant.bean;

//结果集
public class Resourcess {
	
	private boolean resource;
	
	private String code;
	
	private String message;
	
	private Object obj;

	public boolean isResource() {
		return resource;
	}

	public void setResource(boolean resource) {
		this.resource = resource;
	}

	public String getCode() {
		return code;
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

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Resources [resource=" + resource + ", code=" + code + ", message=" + message + ", obj=" + obj + "]";
	}
	
	
}
