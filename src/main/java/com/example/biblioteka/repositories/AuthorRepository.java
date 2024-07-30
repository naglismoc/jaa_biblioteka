package com.example.biblioteka.repositories;

import com.example.biblioteka.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
