package com.atfcm.dcb.service.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.atfcm.dcb.domain.Airport;

public interface AirportRepository extends Repository<Airport, Long> {
	
	List<Airport> findAll();
	Airport findByName(String name);
	Airport findOne(Long id);
}	
