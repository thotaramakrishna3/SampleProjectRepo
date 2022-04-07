package com.trainings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainings.entity.Trainer;

@Repository
public interface TrainerRepo extends JpaRepository<Trainer, Long> {

}
