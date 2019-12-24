package com.angiii.learningplatformbackend.repository;

import com.angiii.learningplatformbackend.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
