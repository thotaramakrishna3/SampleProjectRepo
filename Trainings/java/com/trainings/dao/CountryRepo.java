package com.trainings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainings.entity.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Long>{

}
