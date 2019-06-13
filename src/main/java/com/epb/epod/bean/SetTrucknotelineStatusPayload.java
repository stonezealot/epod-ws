package com.epb.epod.bean;

import java.math.BigDecimal;

public class SetTrucknotelineStatusPayload {

	private BigDecimal trucknoteRecKey;
	private BigDecimal trucknotelineRecKey;
	private String deliveryStatus;
	private String podId;
	private String remark;
	private String userId;

	public SetTrucknotelineStatusPayload() {
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

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getPodId() {
		return podId;
	}

	public void setPodId(String podId) {
		this.podId = podId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
