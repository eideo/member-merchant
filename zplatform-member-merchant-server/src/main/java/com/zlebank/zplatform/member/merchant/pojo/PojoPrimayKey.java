package com.zlebank.zplatform.member.merchant.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_C_PRIMAY_KEY")
public class PojoPrimayKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3048994100357163558L;

	private String keyname;

	private long nextId;

	private long increment;

	private String notes;

	@Id
	@Column(name ="KEY_NAME")
	public String getKeyname() {
		return keyname;
	}

	public void setKeyname(String keyname) {
		this.keyname = keyname;
	}

	@Column(name ="NEXT_ID")
	public long getNextId() {
		return nextId;
	}

	public void setNextId(long nextId) {
		this.nextId = nextId;
	}

	@Column(name ="INCREMENT_BY")
	public long getIncrement() {
		return increment;
	}

	public void setIncrement(long increment) {
		this.increment = increment;
	}

	@Column(name = "NOTES")
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
