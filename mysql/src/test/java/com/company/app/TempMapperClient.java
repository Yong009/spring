package com.company.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;

import com.company.app.emp.EmpVO;
import com.company.app.emp.mapper.EmpMapper;
import com.company.app.temp.mapper.TempMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/config/*-context.xml")

public class TempMapperClient {
	
	@Autowired TempMapper tempMapper;
	
	@Autowired EmpMapper empMapper;
	
	
	public void getDate() {
		tempMapper.getDate();
		
	}
	
	
	public  void getList(EmpVO vo) {
		
		
		
		empMapper.getList();
	}
}
