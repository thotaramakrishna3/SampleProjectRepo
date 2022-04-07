package com.trainings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainings.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
