package com.braggbnb118.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbnb118.domain.Location;
import com.braggbnb118.dto.LocationDTO;
import com.braggbnb118.dto.LocationSearchDTO;
import com.braggbnb118.dto.LocationPageDTO;
import com.braggbnb118.dto.LocationConvertCriteriaDTO;
import com.braggbnb118.service.GenericService;
import com.braggbnb118.dto.common.RequestDTO;
import com.braggbnb118.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface LocationService extends GenericService<Location, Integer> {

	List<Location> findAll();

	ResultDTO addLocation(LocationDTO locationDTO, RequestDTO requestDTO);

	ResultDTO updateLocation(LocationDTO locationDTO, RequestDTO requestDTO);

    Page<Location> getAllLocations(Pageable pageable);

    Page<Location> getAllLocations(Specification<Location> spec, Pageable pageable);

	ResponseEntity<LocationPageDTO> getLocations(LocationSearchDTO locationSearchDTO);
	
	List<LocationDTO> convertLocationsToLocationDTOs(List<Location> locations, LocationConvertCriteriaDTO convertCriteria);

	LocationDTO getLocationDTOById(Integer locationId);







}





