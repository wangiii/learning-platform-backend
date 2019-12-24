package com.angiii.learningplatformbackend.service;

import com.angiii.learningplatformbackend.repository.HomeworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeworkService {

    @Autowired
    private HomeworkRepository homeworkRepository;
}
