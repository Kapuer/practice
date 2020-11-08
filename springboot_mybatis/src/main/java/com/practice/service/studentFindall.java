package com.practice.service;

import com.practice.domain.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface studentFindall {
    @Autowired
    student findallstudents();

}
