package com.atfcm.dcb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.atfcm.dcb.domain.Airport;
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

	@Override
	@Query("from airport where id > 1")
	public List<Airport> getAllFlightsAfter3PM() {
		
		return null;
	}

}
