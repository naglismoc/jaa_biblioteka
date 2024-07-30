package com.example.biblioteka.services;

import com.example.biblioteka.models.Book;
import com.example.biblioteka.models.Type;
import com.example.biblioteka.repositories.BookRepository;
import com.example.biblioteka.repositories.TypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final TypeRepository typeRepository;

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public void saveBookWithTypes(Book book){
        for(Type type : book.getTypes()){
            typeRepository.save(type);
        }
        bookRepository.save(book);
    }
}
