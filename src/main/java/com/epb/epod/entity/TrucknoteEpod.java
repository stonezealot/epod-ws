package com.epb.epod.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrucknoteEpod {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String locId;
	private String docId;
	private Date docDate;
	private String statusFlg;
	private String truckStatus;
	private String userId;
	private String empId;
	private String vslId;
	private String marking;
	private String truckId;
	private String truckName;
	private String driverId;
	private String driverName;
	private Date etd;
	private Date eta;
	private String remark;
	private BigDecimal totalAmount;
	private BigDecimal totalCharge;
	private BigDecimal totalBox;
	private BigDecimal totalQty;
	private BigDecimal totalWeight;
	private BigDecimal totalVolumn;
	private BigDecimal totalValue;
	private BigDecimal totalStops;

	public TrucknoteEpod() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getLocId() {
		return locId;
	}

	public void setLocId(String locId) {
		this.locId = locId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public Date getDocDate() {
		return docDate;
	}

	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}

	public String getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}

	public String getTruckStatus() {
		return truckStatus;
	}

	public void setTruckStatus(String truckStatus) {
		this.truckStatus = truckStatus;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getVslId() {
		return vslId;
	}

	public void setVslId(String vslId) {
		this.vslId = vslId;
	}

	public String getMarking() {
		return marking;
	}

	public void setMarking(String marking) {
		this.marking = marking;
	}

	public String getTruckId() {
		return truckId;
	}

	public void setTruckId(String truckId) {
		this.truckId = truckId;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Date getEtd() {
		return etd;
	}

	public void setEtd(Date etd) {
		this.etd = etd;
	}

	public Date getEta() {
		return eta;
	}

	public void setEta(Date eta) {
		this.eta = eta;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(BigDecimal totalCharge) {
		this.totalCharge = totalCharge;
	}

	public BigDecimal getTotalBox() {
		return totalBox;
	}

	public void setTotalBox(BigDecimal totalBox) {
		this.totalBox = totalBox;
	}

	public BigDecimal getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(BigDecimal totalQty) {
		this.totalQty = totalQty;
	}

	public BigDecimal getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(BigDecimal totalWeight) {
		this.totalWeight = totalWeight;
	}

	public BigDecimal getTotalVolumn() {
		return totalVolumn;
	}

	public void setTotalVolumn(BigDecimal totalVolumn) {
		this.totalVolumn = totalVolumn;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	public BigDecimal getTotalStops() {
		return totalStops;
	}

	public void setTotalStops(BigDecimal totalStops) {
		this.totalStops = totalStops;
	}

}
