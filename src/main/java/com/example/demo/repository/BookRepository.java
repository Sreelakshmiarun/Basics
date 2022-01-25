package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Books;

public interface BookRepository extends MongoRepository<Books, Integer> {

}
