package com.epb.epod.bean;

import java.math.BigDecimal;

public class AddTrucknotelinePayload {

	private BigDecimal trucknoteRecKey;
	private String documentBarcode;
	private String userId;

	public AddTrucknotelinePayload() {
		super();
	}

	public BigDecimal getTrucknoteRecKey() {
		return trucknoteRecKey;
	}

	public void setTrucknoteRecKey(BigDecimal trucknoteRecKey) {
		this.trucknoteRecKey = trucknoteRecKey;
	}

	public String getDocumentBarcode() {
		return documentBarcode;
	}

	public void setDocumentBarcode(String documentBarcode) {
		this.documentBarcode = documentBarcode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
