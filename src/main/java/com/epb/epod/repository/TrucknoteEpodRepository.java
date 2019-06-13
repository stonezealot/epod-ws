package com.epb.epod.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.epod.entity.TrucknoteEpod;

public interface TrucknoteEpodRepository
		extends JpaRepository<TrucknoteEpod, BigDecimal> {

	List<TrucknoteEpod> findByUserIdOrderByDocId(String userId);
}
