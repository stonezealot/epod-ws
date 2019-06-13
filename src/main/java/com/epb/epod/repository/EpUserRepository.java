package com.epb.epod.repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.epod.entity.EpUser;

public interface EpUserRepository
		extends JpaRepository<EpUser, BigDecimal> {

	Optional<EpUser> findByUserId(String userId);
}
