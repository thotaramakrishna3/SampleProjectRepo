package com.trainings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainings.entity.Profile;

@Repository
public interface ProfilesRepo extends JpaRepository<Profile, Long>{

}
