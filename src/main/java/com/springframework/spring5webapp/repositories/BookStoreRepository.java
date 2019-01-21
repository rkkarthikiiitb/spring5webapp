package com.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.spring5webapp.model.BookStore;

public interface BookStoreRepository extends CrudRepository<BookStore, Long> {

}
