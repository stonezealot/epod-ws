package com.epb.epod.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.epod.entity.Truckmas;

public interface TruckmasRepository
		extends JpaRepository<Truckmas, BigDecimal> {

}
