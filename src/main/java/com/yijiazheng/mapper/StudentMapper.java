package com.yijiazheng.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yijiazheng.entity.Student;

//@Mapper 
public interface StudentMapper {
    public List<Student> findAll();
}
