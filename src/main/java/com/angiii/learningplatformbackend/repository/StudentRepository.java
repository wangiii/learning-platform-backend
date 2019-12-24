package com.angiii.learningplatformbackend.repository;

import com.angiii.learningplatformbackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
