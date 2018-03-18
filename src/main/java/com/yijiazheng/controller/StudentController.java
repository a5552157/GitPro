package com.yijiazheng.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijiazheng.entity.Student;
import com.yijiazheng.service.StudentService;

@RestController
@EnableAutoConfiguration
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/hello")
	public String doHello() {
		return "hello world";
	}
	
	@RequestMapping("/findAllStudent.do")
	public List<Student> findAllStudent() {
		return studentService.findAll();
	}
}
