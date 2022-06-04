package com.starter.lifseed.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starter.lifseed.com.models.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
