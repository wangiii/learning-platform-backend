package com.angiii.learningplatformbackend.service;

import com.angiii.learningplatformbackend.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MajorService {

    @Autowired
    private MajorRepository majorRepository;
}
