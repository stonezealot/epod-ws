package com.epb.epod.service;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.epb.epod.service.ProcedureResponse;

@Service
@Profile("oracle")
public class ProcedureServiceOracle
		implements ProcedureService {

	@Override
	public ProcedureResponse addTrucknote(
			final String charset,
			final String orgId,
			final String locId,
			final String truckId,
			final String userId,
			final String remark) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_org_id", orgId)
				.addValue("v_loc_id", locId)
				.addValue("v_truck_id", truckId)
				.addValue("v_user_id", userId)
				.addValue("v_remark", remark);

		final Map<String, Object> out = this.addTrucknoteCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}

	@Override
	public ProcedureResponse addTrucknoteline(
			final String charset,
			final BigDecimal trucknoteRecKey,
			final String documentBarcode,
			final String userId) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_trucknote_rec_key", trucknoteRecKey)
				.addValue("v_document_barcode", documentBarcode)
				.addValue("v_user_id", userId);

		final Map<String, Object> out = this.addTrucknotelineCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}

	@Override
	public ProcedureResponse delTrucknoteline(
			final String charset,
			final BigDecimal trucknoteRecKey,
			final BigDecimal trucknotelineRecKey,
			final String userId) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_trucknote_rec_key", trucknoteRecKey)
				.addValue("v_trucknoteline_rec_key", trucknotelineRecKey)
				.addValue("v_user_id", userId);

		final Map<String, Object> out = this.delTrucknotelineCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}

	@Override
	public ProcedureResponse setTrucknoteStatus(
			final String charset,
			final BigDecimal trucknoteRecKey,
			final String trucknoteStatus,
			final String userId) {

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_trucknote_rec_key", trucknoteRecKey)
				.addValue("v_trucknote_status", trucknoteStatus)
				.addValue("v_user_id", userId);

		final Map<String, Object> out = this.setTrucknoteStatusCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
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

		final SqlParameterSource in = new MapSqlParameterSource()
				.addValue("v_charset", "")
				.addValue("v_trucknote_rec_key", trucknoteRecKey)
				.addValue("v_trucknoteline_rec_key", trucknotelineRecKey)
				.addValue("v_delivery_status", deliveryStatus)
				.addValue("v_pod_id", podId)
				.addValue("v_remark", remark)
				.addValue("v_user_id", userId);

		final Map<String, Object> out = this.setTrucknotelineStatusCall.execute(in);
		if (!ERR_CODE_OK.equals((String) out.get("v_err_code"))) {
			throw new RuntimeException((String) out.get("v_err_msg"));
		}

		final ProcedureResponse response = new ProcedureResponse(
				(String) out.get("v_err_code"),
				(String) out.get("v_err_msg"));

		return response;
	}
	//
	// fields
	//

	private final JdbcTemplate jdbcTemplate;

	private final SimpleJdbcCall addTrucknoteCall;
	private final SimpleJdbcCall addTrucknotelineCall;
	private final SimpleJdbcCall delTrucknotelineCall;
	private final SimpleJdbcCall setTrucknoteStatusCall;
	private final SimpleJdbcCall setTrucknotelineStatusCall;

	//
	// constructor
	//

	@Autowired
	public ProcedureServiceOracle(final JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate.setResultsMapCaseInsensitive(true);

		this.addTrucknoteCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_trucknote")
				.withProcedureName("add_trucknote");
		this.addTrucknotelineCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_trucknote")
				.withProcedureName("add_trucknoteline");
		this.delTrucknotelineCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_trucknote")
				.withProcedureName("del_trucknoteline");
		this.setTrucknoteStatusCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_trucknote")
				.withProcedureName("set_trucknote_status");
		this.setTrucknotelineStatusCall = new SimpleJdbcCall(this.jdbcTemplate)
				.withCatalogName("ep_trucknote")
				.withProcedureName("set_trucknoteline_status");

	}

}
