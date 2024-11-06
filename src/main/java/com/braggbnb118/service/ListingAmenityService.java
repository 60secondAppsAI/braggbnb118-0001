package com.braggbnb118.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.braggbnb118.domain.ListingAmenity;
import com.braggbnb118.dto.ListingAmenityDTO;
import com.braggbnb118.dto.ListingAmenitySearchDTO;
import com.braggbnb118.dto.ListingAmenityPageDTO;
import com.braggbnb118.dto.ListingAmenityConvertCriteriaDTO;
import com.braggbnb118.service.GenericService;
import com.braggbnb118.dto.common.RequestDTO;
import com.braggbnb118.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ListingAmenityService extends GenericService<ListingAmenity, Integer> {

	List<ListingAmenity> findAll();

	ResultDTO addListingAmenity(ListingAmenityDTO listingAmenityDTO, RequestDTO requestDTO);

	ResultDTO updateListingAmenity(ListingAmenityDTO listingAmenityDTO, RequestDTO requestDTO);

    Page<ListingAmenity> getAllListingAmenitys(Pageable pageable);

    Page<ListingAmenity> getAllListingAmenitys(Specification<ListingAmenity> spec, Pageable pageable);

	ResponseEntity<ListingAmenityPageDTO> getListingAmenitys(ListingAmenitySearchDTO listingAmenitySearchDTO);
	
	List<ListingAmenityDTO> convertListingAmenitysToListingAmenityDTOs(List<ListingAmenity> listingAmenitys, ListingAmenityConvertCriteriaDTO convertCriteria);

	ListingAmenityDTO getListingAmenityDTOById(Integer listingAmenityId);







}





