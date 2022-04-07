package com.trainings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainings.entity.State;

@Repository
public interface StateRepo extends JpaRepository<State, Long> {

}
