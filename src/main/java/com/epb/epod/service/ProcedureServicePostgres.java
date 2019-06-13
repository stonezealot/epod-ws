package com.epb.epod.service;

import java.math.BigDecimal;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.epb.epod.service.ProcedureResponse;

@Service
@Profile("postgres")
public class ProcedureServicePostgres
		implements ProcedureService {

	@Override
	public ProcedureResponse addTrucknote(
			final String charset,
			final String orgId,
			final String locId,
			final String truckId,
			final String userId,
			final String remark) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse addTrucknoteline(
			final String charset,
			final BigDecimal trucknoteRecKey,
			final String documentBarcode,
			final String userId) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse delTrucknoteline(
			final String charset,
			final BigDecimal trucknoteRecKey,
			final BigDecimal trucknotelineRecKey,
			final String userId) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse setTrucknoteStatus(
			final String charset,
			final BigDecimal trucknoteRecKey,
			final String trucknoteStatus,
			final String userId) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}

	@Override
	public ProcedureResponse setTrucknotelineStatus(
			final String charset,
			final BigDecimal trucknoteRecKey,
			final BigDecimal trucknotelineRecKey,
			final String deliveryStatus,
			final String podId,
			final String remark,
			final String userId) {

		return new ProcedureResponse(ERR_CODE_OK, "");
	}
}
