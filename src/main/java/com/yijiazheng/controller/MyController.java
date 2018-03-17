package com.yijiazheng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/hello")
	public String doHello() {
		return "hello world";
	}
}
