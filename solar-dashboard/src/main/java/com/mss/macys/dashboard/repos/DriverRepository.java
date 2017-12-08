package com.mss.macys.dashboard.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.macys.dashboard.domain.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
	
	Driver findByEmail(String email);
	
	Driver findById(Long id);
	
	Driver findByIdAndEmail(Long id,String email);
	
	Driver findByUserId(Long userId);

}

