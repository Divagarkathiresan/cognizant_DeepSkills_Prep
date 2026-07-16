package com.cognizant.orm_learn.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.orm_learn.Models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String>{
	
	@Query("SELECT c FROM Country c WHERE c.code=:code")
	Country findByCode(@Param("code") String code);
	
}