package com.yijiazheng;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot扫描mapper接口，需要在每个接口使用注解@Mapper，或者主入口类里使用@MapperScan注解
 */
@SpringBootApplication
@MapperScan("com.yijiazheng.mapper")
public class MySpringBootDemo {
	
	public static void main(String[] args) {
		//项目入口
		SpringApplication.run(MySpringBootDemo.class, args);
	}
}
