package com.braggbnb118.dao;

import java.util.List;

import com.braggbnb118.dao.GenericDAO;
import com.braggbnb118.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


