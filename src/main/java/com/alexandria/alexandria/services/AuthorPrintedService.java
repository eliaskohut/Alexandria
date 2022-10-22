package com.alexandria.alexandria.services;

import com.alexandria.alexandria.entities.Author;
import com.alexandria.alexandria.entities.AuthorPrinted;
import com.alexandria.alexandria.entities.Printed;
import com.alexandria.alexandria.repositories.AuthorPrintedRepository;
import com.alexandria.alexandria.repositories.AuthorRepository;
import com.alexandria.alexandria.repositories.PrintedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorPrintedService {
    @Autowired
    AuthorPrintedRepository authorPrintedRepository;
    @Autowired
    PrintedRepository printedRepository;
    @Autowired
    AuthorRepository authorRepository;

    public AuthorPrintedService() {
    }

    public List<AuthorPrinted> getAuthorPrinted(){
        return authorPrintedRepository.findAll();
    }

    public void addPrinted(AuthorPrinted authorPrinted){
        printedRepository.save(authorPrinted.getPrinted());
        authorPrintedRepository.save(authorPrinted);
    }

    public void removePrinted(AuthorPrinted authorPrinted) {
        printedRepository.delete(authorPrinted.getPrinted());
        authorPrintedRepository.delete(authorPrinted);
    }

    public List<Printed> getPrintedByAuthor(Author author){
        return authorPrintedRepository.findByAuthor(author);
    }

}
