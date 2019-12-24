package com.angiii.learningplatformbackend.controller;

import com.angiii.learningplatformbackend.model.Faculty;
import com.angiii.learningplatformbackend.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FacultyController {

    @Autowired
    FacultyService facultyService;

    @GetMapping("/faculties")
    public List<Faculty> all() {
        return facultyService.findAll();
    }
}
