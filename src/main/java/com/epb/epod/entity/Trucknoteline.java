package com.epb.epod.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trucknoteline {

	@Id
	private BigDecimal recKey;
	private BigDecimal lineNo;
	private String lineRef;
	private String name;
	private String custRef;
	private String ourRef;
	private BigDecimal grossWt;
	private BigDecimal netWt;
	private BigDecimal volumn;
	private String remark;
	private String srcCode;
	private String srcLocId;
	private BigDecimal srcRecKey;
	private String srcDocId;
	private String daddrName;
	private String daddress1;
	private String daddress2;
	private String daddress3;
	private String daddress4;
	private String dcityId;
	private String dstateId;
	private String dcountryId;
	private String dpostalcode;
	private String dphone;
	private String dfax;
	private String dzoneId;
	private String dattnTo;
	private String podId;
	private Date podDate;
	private String userId;
	private BigDecimal totalAmt;
	private BigDecimal chargeAmt;
	private BigDecimal collectAmt;
	private BigDecimal totalCarton;
	private String statusFlg;
	private BigDecimal masRecKey;

	public Trucknoteline() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public BigDecimal getLineNo() {
		return lineNo;
	}

	public void setLineNo(BigDecimal lineNo) {
		this.lineNo = lineNo;
	}

	public String getLineRef() {
		return lineRef;
	}

	public void setLineRef(String lineRef) {
		this.lineRef = lineRef;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustRef() {
		return custRef;
	}

	public void setCustRef(String custRef) {
		this.custRef = custRef;
	}

	public String getOurRef() {
		return ourRef;
	}

	public void setOurRef(String ourRef) {
		this.ourRef = ourRef;
	}

	public BigDecimal getGrossWt() {
		return grossWt;
	}

	public void setGrossWt(BigDecimal grossWt) {
		this.grossWt = grossWt;
	}

	public BigDecimal getNetWt() {
		return netWt;
	}

	public void setNetWt(BigDecimal netWt) {
		this.netWt = netWt;
	}

	public BigDecimal getVolumn() {
		return volumn;
	}

	public void setVolumn(BigDecimal volumn) {
		this.volumn = volumn;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSrcCode() {
		return srcCode;
	}

	public void setSrcCode(String srcCode) {
		this.srcCode = srcCode;
	}

	public String getSrcLocId() {
		return srcLocId;
	}

	public void setSrcLocId(String srcLocId) {
		this.srcLocId = srcLocId;
	}

	public BigDecimal getSrcRecKey() {
		return srcRecKey;
	}

	public void setSrcRecKey(BigDecimal srcRecKey) {
		this.srcRecKey = srcRecKey;
	}

	public String getSrcDocId() {
		return srcDocId;
	}

	public void setSrcDocId(String srcDocId) {
		this.srcDocId = srcDocId;
	}

	public String getDaddrName() {
		return daddrName;
	}

	public void setDaddrName(String daddrName) {
		this.daddrName = daddrName;
	}

	public String getDaddress1() {
		return daddress1;
	}

	public void setDaddress1(String daddress1) {
		this.daddress1 = daddress1;
	}

	public String getDaddress2() {
		return daddress2;
	}

	public void setDaddress2(String daddress2) {
		this.daddress2 = daddress2;
	}

	public String getDaddress3() {
		return daddress3;
	}

	public void setDaddress3(String daddress3) {
		this.daddress3 = daddress3;
	}

	public String getDaddress4() {
		return daddress4;
	}

	public void setDaddress4(String daddress4) {
		this.daddress4 = daddress4;
	}

	public String getDcityId() {
		return dcityId;
	}

	public void setDcityId(String dcityId) {
		this.dcityId = dcityId;
	}

	public String getDstateId() {
		return dstateId;
	}

	public void setDstateId(String dstateId) {
		this.dstateId = dstateId;
	}

	public String getDcountryId() {
		return dcountryId;
	}

	public void setDcountryId(String dcountryId) {
		this.dcountryId = dcountryId;
	}

	public String getDpostalcode() {
		return dpostalcode;
	}

	public void setDpostalcode(String dpostalcode) {
		this.dpostalcode = dpostalcode;
	}

	public String getDphone() {
		return dphone;
	}

	public void setDphone(String dphone) {
		this.dphone = dphone;
	}

	public String getDfax() {
		return dfax;
	}

	public void setDfax(String dfax) {
		this.dfax = dfax;
	}

	public String getDzoneId() {
		return dzoneId;
	}

	public void setDzoneId(String dzoneId) {
		this.dzoneId = dzoneId;
	}

	public String getDattnTo() {
		return dattnTo;
	}

	public void setDattnTo(String dattnTo) {
		this.dattnTo = dattnTo;
	}

	public String getPodId() {
		return podId;
	}

	public void setPodId(String podId) {
		this.podId = podId;
	}

	public Date getPodDate() {
		return podDate;
	}

	public void setPodDate(Date podDate) {
		this.podDate = podDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	public BigDecimal getChargeAmt() {
		return chargeAmt;
	}

	public void setChargeAmt(BigDecimal chargeAmt) {
		this.chargeAmt = chargeAmt;
	}

	public BigDecimal getCollectAmt() {
		return collectAmt;
	}

	public void setCollectAmt(BigDecimal collectAmt) {
		this.collectAmt = collectAmt;
	}

	public BigDecimal getTotalCarton() {
		return totalCarton;
	}

	public void setTotalCarton(BigDecimal totalCarton) {
		this.totalCarton = totalCarton;
	}

	public String getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}

	public BigDecimal getMasRecKey() {
		return masRecKey;
	}

	public void setMasRecKey(BigDecimal masRecKey) {
		this.masRecKey = masRecKey;
	}

}
