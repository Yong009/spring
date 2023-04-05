package org.zerock.sample;

import org.springframework.stereotype.Component;

@Component    // 기억해두길!!!
public class Chef {
	private Chef() {
		System.out.println("Chef() call.");
	}
}
