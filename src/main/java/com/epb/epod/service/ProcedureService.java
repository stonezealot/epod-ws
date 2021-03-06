package com.epb.epod.service;

import java.math.BigDecimal;

import com.epb.epod.service.ProcedureResponse;

public interface ProcedureService {

	ProcedureResponse addTrucknote(
			String charset,
			String orgId,
			String locId,
			String truckId,
			String userId,
			String remark);

	ProcedureResponse addTrucknoteline(
			String charset,
			BigDecimal trucknoteRecKey,
			String documentBarcode,
			String userId);

	ProcedureResponse delTrucknoteline(
			String charset,
			BigDecimal trucknoteRecKey,
			BigDecimal trucknotelineRecKey,
			String userId);

	ProcedureResponse setTrucknoteStatus(
			String charset,
			BigDecimal trucknoteRecKey,
			String trucknoteStatus,
			String userId);

	ProcedureResponse setTrucknotelineStatus(
			String charset,
			BigDecimal trucknoteRecKey,
			BigDecimal trucknotelineRecKey,
			String deliveryStatus,
			String podId,
			String remark,
			String userId);

	static final String ERR_CODE_OK = "OK";
}
