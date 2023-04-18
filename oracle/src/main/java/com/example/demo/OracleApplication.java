package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.emp.mapper.EmpMapper;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.**.mapper")
public class OracleApplication {
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(OracleApplication.class, args);
	}

}
