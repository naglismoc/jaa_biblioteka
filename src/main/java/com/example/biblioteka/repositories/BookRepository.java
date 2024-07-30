package com.example.biblioteka.repositories;

import com.example.biblioteka.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
