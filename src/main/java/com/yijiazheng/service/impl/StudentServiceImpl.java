package com.yijiazheng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yijiazheng.entity.Student;
import com.yijiazheng.mapper.StudentMapper;
import com.yijiazheng.service.StudentService;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {

	@Resource
	StudentMapper studentMapper;
	
	@Override
	public List<Student> findAll() {
		return studentMapper.findAll();
	}
    
}
