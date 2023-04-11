package com.yedam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.domain.BookVO;
import com.yedam.persistence.BookMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class BookServiceImpl implements BookService{
	
	@Setter(onMethod_ = @Autowired)
	private BookMapper bookMapper;

	@Override
	public void register(BookVO book) {
		bookMapper.insertBook(book);
		
	}
}
