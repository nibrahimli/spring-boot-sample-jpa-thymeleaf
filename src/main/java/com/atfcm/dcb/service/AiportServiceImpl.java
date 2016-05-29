package com.atfcm.dcb.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.atfcm.dcb.service.repository.AirportRepository;

@Repository
@Transactional
public class AiportServiceImpl implements AirportService{
	
	private AirportRepository repository;
	
	public AiportServiceImpl() {
	}
	
	public AiportServiceImpl(AirportRepository airportRepository) {
		this.repository = airportRepository;
	}

}
