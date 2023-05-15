package com.example.demo;

import java.util.List;
import java.util.Map;

import javax.swing.Spring;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.emp.mapper.EmpMapper;

@SpringBootTest
class OracleApplicationTests {
	
	@Autowired 
	EmpMapper empMapper;
	
	@Test 
	void empList(){
		List<Map<String,Object>> list = empMapper.getEmpList();
		System.out.println(list.get(0));
	}
		
	
	void contextLoads() {
	}
	
	@Autowired
	StringEncryptor jasyptStringEncryptor;
	
	@Test
	public void jasyt_test() {
		String[] plaintTestList = {"jdbc:oracle:thin:@127.0.0.1:1521/xe","hr","hr"};
		for(String plainText : plaintTestList) {
			String encyptText = jasyptStringEncryptor.encrypt(plainText);
			System.out.println(encyptText);
		}
	}
	
	
}
