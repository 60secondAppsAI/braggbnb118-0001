package com.braggbnb118.dao;

import java.util.List;

import com.braggbnb118.dao.GenericDAO;
import com.braggbnb118.domain.Location;





public interface LocationDAO extends GenericDAO<Location, Integer> {
  
	List<Location> findAll();
	






}


