package com.yedam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.yedam.domain.BookVO;
import com.yedam.service.BookService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller

@Log4j
public class Bookcontroller {
	
	@Setter(onMethod_ = @Autowired)
	private BookService bookService;
	
	@GetMapping("index")
	public String start() {
		return "index";
	}
	
	@RequestMapping(value="register",method = RequestMethod.POST)
	public String insert(BookVO book) {
		bookService.register(book);
		log.info(book);
		return "index";
		
	}
	
	
	@GetMapping("register")
	public String insert() {
		
		return "book/register";
		//등록화면
	}
	
	
}
