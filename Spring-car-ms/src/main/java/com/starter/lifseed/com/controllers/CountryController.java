package com.starter.lifseed.com.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starter.lifseed.com.models.Country;
import com.starter.lifseed.com.services.CountryService;

@Controller
public class CountryController {

	// autowire the country service in the controller
	@Autowired
	private CountryService countryService;

	@GetMapping("/countries")
	public String getCountries(Model model) {

		// obj to access getCountries() in countryService.
		List<Country> list_of_countries = countryService.getAllCountries();
		// to pass list_of_countries to the html page
		model.addAttribute("countries", list_of_countries); // "countries"- attribute name that can be accessed in the
															// html page.
		return "country";
	}
	
	//implementing the save country service
	@PostMapping("/countries/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		
		return "redirect:/countries?success"; //redirect to the same page.
	}
	
	//return single country by id and populate the edit form.
	@RequestMapping("/countries/findById/")
	@ResponseBody
	public Optional<Country> findById(Integer id) {
		return countryService.findById(id);
	}

}
