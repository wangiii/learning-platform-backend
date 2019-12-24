package com.angiii.learningplatformbackend.repository;

import com.angiii.learningplatformbackend.model.Homework;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworkRepository extends JpaRepository<Homework, Long> {
}
