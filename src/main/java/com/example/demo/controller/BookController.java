package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Books;
import com.example.demo.repository.BookRepository;


@RestController
@Component
public class BookController {
	
	Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/saveBook")
	public String saveBook(@RequestBody Books books)
	{
		bookRepository.save(books);
		return "Successfully added";
	}
	
	@GetMapping(path = "/getBook")
	public List<Books> getBook()
	{
		logger.info("[getBook] info message");
		logger.warn("[getBook] warn message");
		logger.error("[getBook] error message");
		logger.debug("[getBook] debug message");
		logger.trace("[getBook] trace message");
		// System.out.println(10/0);    //This line for error.log file message seeing purpose
		return bookRepository.findAll();
	}
	

	
	
}
