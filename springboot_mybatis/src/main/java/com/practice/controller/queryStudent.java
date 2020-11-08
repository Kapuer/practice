package com.practice.controller;

import com.practice.domain.student;
import com.practice.service.studentFindall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/demo")
public class queryStudent {
    @Autowired
    studentFindall findallstudent;
    @GetMapping("demo")
    student querystudentlist(){

        return findallstudent.findallstudents();
    }

    public queryStudent() {
    }
}
