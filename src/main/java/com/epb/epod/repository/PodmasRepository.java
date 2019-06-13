package com.epb.epod.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.epod.entity.Podmas;

public interface PodmasRepository
		extends JpaRepository<Podmas, BigDecimal> {

}
