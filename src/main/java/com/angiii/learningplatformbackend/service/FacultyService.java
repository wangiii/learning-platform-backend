package com.angiii.learningplatformbackend.service;

import com.angiii.learningplatformbackend.model.Faculty;
import com.angiii.learningplatformbackend.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    FacultyRepository facultyRepository;

    public List<Faculty> findAll() {
        return facultyRepository.findAll();
    };
}
