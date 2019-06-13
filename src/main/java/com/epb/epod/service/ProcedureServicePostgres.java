package com.epb.epod.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.epb.epod.service.ProcedureResponse;

@Service
@Profile("postgres")
public class ProcedureServicePostgres
		implements ProcedureService {

	
}
