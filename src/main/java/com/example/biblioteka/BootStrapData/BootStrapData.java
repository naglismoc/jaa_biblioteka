package com.example.biblioteka.BootStrapData;

import com.example.biblioteka.models.Author;
import com.example.biblioteka.models.Book;
import com.example.biblioteka.models.Type;
import com.example.biblioteka.services.AuthorService;
import com.example.biblioteka.services.BookService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class BootStrapData implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(BootStrapData.class);
    private final AuthorService authorService;
    private final BookService bookService;

//    public BootStrapData(AuthorService authorService, BookService bookService) {
//        this.authorService = authorService;
//        this.bookService = bookService;
//    }
    @Override
    public void run(String... args) throws Exception {
        Author a = new Author("Jonas2","Vaisgantas");
        Book b1 = new Book("Grybu karas ir taika2","politine satyra");
        Book b2 = new Book("kakes makes nuottykiai2","literatura vaikams");
        a.addBook(b1);
        a.addBook(b2);
        authorService.saveAuthor(a);

        Type t1 = new Type("enciklopedijos");
        Type t2 = new Type("rožinė literatūra");

        b1.addType(t1);
        b1.addType(t2);
        b2.addType(t1);

        bookService.saveBookWithTypes(b1);
        bookService.saveBookWithTypes(b2);

    }
}
