package com.epb.epod.bean;

import java.math.BigDecimal;

public class DelTrucknotelinePayload {

	private BigDecimal trucknoteRecKey;
	private BigDecimal trucknotelineRecKey;
	private String userId;

	public DelTrucknotelinePayload() {
		super();
	}

	public BigDecimal getTrucknoteRecKey() {
		return trucknoteRecKey;
	}

	public void setTrucknoteRecKey(BigDecimal trucknoteRecKey) {
		this.trucknoteRecKey = trucknoteRecKey;
	}

	public BigDecimal getTrucknotelineRecKey() {
		return trucknotelineRecKey;
	}

	public void setTrucknotelineRecKey(BigDecimal trucknotelineRecKey) {
		this.trucknotelineRecKey = trucknotelineRecKey;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
