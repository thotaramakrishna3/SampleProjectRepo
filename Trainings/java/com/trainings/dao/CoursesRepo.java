package com.trainings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainings.entity.Courses;

@Repository
public interface CoursesRepo extends JpaRepository<Courses, Long>{

}
