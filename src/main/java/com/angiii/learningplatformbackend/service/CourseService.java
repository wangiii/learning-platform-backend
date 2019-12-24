package com.angiii.learningplatformbackend.service;

import com.angiii.learningplatformbackend.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@Transactional
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
}
