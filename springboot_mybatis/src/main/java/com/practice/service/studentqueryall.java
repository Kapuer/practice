package com.practice.service;

import com.practice.domain.student;
import com.practice.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class studentqueryall implements studentFindall{
    @Autowired
     StudentMapper studentMapper;
    public student findallstudents() {

        return studentMapper.querysomething();
    }

    public studentqueryall() {
    }
}
