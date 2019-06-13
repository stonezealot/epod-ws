package com.epb.epod.bean;

import java.math.BigDecimal;

public class SetTrucknoteStatusPayload {

	private BigDecimal trucknoteRecKey;
	private String trucknoteStatus;
	private String userId;

	public SetTrucknoteStatusPayload() {
		super();
	}

	public BigDecimal getTrucknoteRecKey() {
		return trucknoteRecKey;
	}

	public void setTrucknoteRecKey(BigDecimal trucknoteRecKey) {
		this.trucknoteRecKey = trucknoteRecKey;
	}

	public String getTrucknoteStatus() {
		return trucknoteStatus;
	}

	public void setTrucknoteStatus(String trucknoteStatus) {
		this.trucknoteStatus = trucknoteStatus;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
