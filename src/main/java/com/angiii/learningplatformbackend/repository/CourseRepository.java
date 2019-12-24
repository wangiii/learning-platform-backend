package com.angiii.learningplatformbackend.repository;

import com.angiii.learningplatformbackend.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
