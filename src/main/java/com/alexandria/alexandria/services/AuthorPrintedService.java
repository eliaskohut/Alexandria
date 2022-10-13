package com.alexandria.alexandria.services;

import com.alexandria.alexandria.entities.Author;
import com.alexandria.alexandria.entities.AuthorPrinted;
import com.alexandria.alexandria.repositories.AuthorPrintedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorPrintedService {
    @Autowired
    AuthorPrintedRepository authorPrintedRepository;

    public AuthorPrintedService() {
    }

    public List<AuthorPrinted> getAuthorPrinted(){
        return authorPrintedRepository.findAll();
    }

    public void addAuthorPrinted(AuthorPrinted authorPrinted){
        authorPrintedRepository.save(authorPrinted);
    }

    public void removeAuthorPrinted(AuthorPrinted authorPrinted) {
        authorPrintedRepository.delete(authorPrinted);
    }
}
