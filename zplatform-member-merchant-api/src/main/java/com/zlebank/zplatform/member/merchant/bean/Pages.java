package com.zlebank.zplatform.member.merchant.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 分页查询结果集
 * 
 * @param <T>
 **/
public class Pages<T> implements Serializable {

	private static final long serialVersionUID = 7141247625747940471L;

	private Long row;

	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Long getRow() {
		return row;
	}

	public void setRow(Long row) {
		this.row = row;
	}

}
