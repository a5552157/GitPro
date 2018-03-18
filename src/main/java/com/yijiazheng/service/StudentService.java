package com.yijiazheng.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yijiazheng.entity.Student;

public interface StudentService {

	List<Student> findAll();
}
