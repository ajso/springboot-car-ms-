package com.starter.lifseed.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starter.lifseed.com.models.Country;
import com.starter.lifseed.com.repositories.CountryRepository;

@Service
public class CountryService {
	
	//autowired the country repository. this is how to autowire a bean into a service.
	@Autowired
	private CountryRepository countryRpository;
	
	//this service will retrieve a list of countries from the mysql database.
	public List<Country> getAllCountries(){
		return countryRpository.findAll();
	}
	

}
