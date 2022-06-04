package com.starter.lifseed.com.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {

	@GetMapping("/vehicle_make")
	public String getMake() {
		return "vehicleMake";
	}
}
