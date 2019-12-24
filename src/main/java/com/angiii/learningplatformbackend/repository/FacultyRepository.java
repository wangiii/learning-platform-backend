package com.angiii.learningplatformbackend.repository;

import com.angiii.learningplatformbackend.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
