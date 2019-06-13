package com.epb.epod.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.epod.entity.Trucknoteline;

public interface TrucknotelineRepository
		extends JpaRepository<Trucknoteline, BigDecimal> {

	List<Trucknoteline> findByMasRecKeyOrderByLineNo(BigDecimal masRecKey);
}
