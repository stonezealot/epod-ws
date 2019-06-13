package com.epb.epod.service;

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

	
	//
	// fields
	//

	private final JdbcTemplate jdbcTemplate;

	

	//
	// constructor
	//

	@Autowired
	public ProcedureServiceOracle(final JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate.setResultsMapCaseInsensitive(true);

		
	}

}
