package com.atfcm.dcb.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atfcm.dcb.domain.Airport;
import com.atfcm.dcb.service.repository.AirportRepository;

@Controller
public class ATFCMDCBController {

	@Autowired
	AirportRepository airportRep ;
	
	@RequestMapping("/")
	public String index(Model model){
		Airport airport = airportRep.findOne(new Long(1));
		model.addAttribute("airport", airport);
		return "index";
	}
	
	@RequestMapping("/profile")
	public Model great(Model model){
		Airport gyd = airportRep.findByName("GYD");
		List<Airport> airports = airportRep.findAll();
		airports.add(gyd);
		model.addAttribute("airports", airports);
		return model;
	}
	
	@RequestMapping("/hotspot")
	public Model hello(Model model){
		Airport gyd = airportRep.findByFlightNumber("J777");
		//List<Airport> airports = airportRep.findAll();
		//airports.add(gyd);
		model.addAttribute("airport", gyd);
		return model;
	}
	
}
