package com.atfcm.dcb.service;

import java.util.List;

import com.atfcm.dcb.domain.Airport;

public interface AirportService {
	List<Airport> getAllFlightsAfter3PM();
}
