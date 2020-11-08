package com.practice.mapper;

import ch.qos.logback.core.boolex.EvaluationException;
import com.practice.domain.student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.temporal.ValueRange;
import java.util.List;

@Mapper
public interface StudentMapper {
    student querysomething();
}