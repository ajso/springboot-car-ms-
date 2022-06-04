package com.starter.lifseed.com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.starter.lifseed.com.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
