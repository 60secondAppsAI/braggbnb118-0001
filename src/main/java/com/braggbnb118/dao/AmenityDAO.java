package com.braggbnb118.dao;

import java.util.List;

import com.braggbnb118.dao.GenericDAO;
import com.braggbnb118.domain.Amenity;





public interface AmenityDAO extends GenericDAO<Amenity, Integer> {
  
	List<Amenity> findAll();
	






}


