package com.company.app;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptClient {
	
	@Test
	public void encode() {
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder(16);
		String password = bcrypt.encode("1111");
		System.out.println(password);
		assertTrue( bcrypt.matches("1111", password));
	}
}
