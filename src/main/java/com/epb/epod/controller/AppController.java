package com.epb.epod.controller;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.time.format.DateTimeFormatter;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epb.epod.bean.Master;
import com.epb.epod.entity.Podmas;
import com.epb.epod.entity.Truckmas;
import com.epb.epod.repository.PodmasRepository;
import com.epb.epod.repository.TruckmasRepository;
import com.epb.epod.service.ProcedureResponse;
import com.epb.epod.service.ProcedureService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AppController {

	//
	// request mappings
	//
	@GetMapping("/master")
	public ResponseEntity<Master> getMaster() {

		final List<Truckmas> truckmas = this.truckmasRepository
				.findAll();

		final List<Podmas> podmas = this.podmasRepository
				.findAll();

		return ResponseEntity.ok(
				new Master(
						truckmas, podmas));
	}

	//
	// private methods
	//

	//
	// fields
	//

	private final Log log = LogFactory.getLog(AppController.class);

	private final JdbcTemplate jdbcTemplate;

	private final TruckmasRepository truckmasRepository;
	private final PodmasRepository podmasRepository;

	private final ProcedureService procedureService;

	private final String dateFormatPattern = "yyyy-MM-dd";
	final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
			this.dateFormatPattern);

	//
	// constructor
	//

	@Autowired
	public AppController(
			final JdbcTemplate jdbcTemplate,
			final ProcedureService procedureService,
			final TruckmasRepository truckmasRepository,
			final PodmasRepository podmasRepository) {

		super();

		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate.setResultsMapCaseInsensitive(true);
		this.truckmasRepository = truckmasRepository;
		this.podmasRepository = podmasRepository;

		this.procedureService = procedureService;

	}

}