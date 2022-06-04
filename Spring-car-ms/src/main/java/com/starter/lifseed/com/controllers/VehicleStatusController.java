package com.starter.lifseed.com.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleStatusController {
	
	@GetMapping("/vehicle_status")
	public String getStatus() {
		return "vehicleStatus";
	}

}
