package com.alexandria.alexandria;

import com.alexandria.alexandria.entities.*;
import com.alexandria.alexandria.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class AlexandriaApplication implements CommandLineRunner {
//    @Autowired
//    UserService userService;
    @Autowired
    AuthorService authorService;
//    @Autowired
//    AuthorPrintedService authorPrintedService;
//    @Autowired
//    BorrowService borrowService;


    public static void main(String[] args) {
        SpringApplication.run(AlexandriaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Author fnietzcshe = new Author("Friedrich", "Nietzsche", 1844, 1900);
        Author fnietzcshe2 = new Author("Friedrich", "Nietzsche", 1844, 1900);
        Author fnietzcshe5 = new Author("Fryderyk", "Nietzsche", 1844, 1900);
        authorService.addAuthor(fnietzcshe);
        authorService.addAuthor(fnietzcshe2);
        authorService.addAuthor(fnietzcshe5);

    }
}
