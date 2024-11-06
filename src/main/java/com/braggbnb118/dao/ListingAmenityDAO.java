package com.braggbnb118.dao;

import java.util.List;

import com.braggbnb118.dao.GenericDAO;
import com.braggbnb118.domain.ListingAmenity;





public interface ListingAmenityDAO extends GenericDAO<ListingAmenity, Integer> {
  
	List<ListingAmenity> findAll();
	






}


