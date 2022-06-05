package com.starter.lifseed.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMaintenanceController {

	@GetMapping("/vehicle_maintenance")
	public String getMaintenance() {
		return "vehicleMaintenance";
	}

}
