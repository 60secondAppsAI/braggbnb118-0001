package com.braggbnb118.dao;

import java.util.List;

import com.braggbnb118.dao.GenericDAO;
import com.braggbnb118.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


