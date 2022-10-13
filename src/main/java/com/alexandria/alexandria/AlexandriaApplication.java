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
    @Autowired
    UserService userService;
    @Autowired
    AuthorService authorService;
    @Autowired
    AuthorPrintedService authorPrintedService;
    @Autowired
    BorrowService borrowService;


    public static void main(String[] args) {
        SpringApplication.run(AlexandriaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User vitalik = new User("Vitalii", "Klichko", "vvityapobetitel",
                "vklichko@ukr.net", "123321qwerty", "Admin");
        Printed thusSpokeZarathustra = new Printed("Thus Spoke Zarathustra", 1883,
                "Book", "Philosophy", 12.3);
        userService.addUser(vitalik);
        authorService.addAuthor(new Author("Friedrich", "Nietzsche", 1844, 1900));
        authorPrintedService.addPrinted(new AuthorPrinted(authorService.getAuthor("Friedrich", "Nietzsche"),
                thusSpokeZarathustra));
        borrowService.addBorrow(new Borrow(LocalDate.now().plusDays(2),
                thusSpokeZarathustra,
                vitalik));
    }
}
