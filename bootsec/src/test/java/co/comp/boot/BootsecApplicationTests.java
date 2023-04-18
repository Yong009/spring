package co.comp.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.comp.boot.temp.mapper.TempMapper;

@SpringBootTest
class BootsecApplicationTests {
	
	@Autowired TempMapper tempMapper;
	
	void contextLoads() {
	}
	@Test
	public void getDate() {
		tempMapper.getDate();
	}
}
