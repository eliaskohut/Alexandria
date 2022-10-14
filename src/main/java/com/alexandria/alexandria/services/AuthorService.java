package com.alexandria.alexandria.services;

import com.alexandria.alexandria.entities.Author;
import com.alexandria.alexandria.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public AuthorService() {
    }

    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }

    public void addAuthor(Author author){
        authorRepository.save(author);
    }

    public void removeAuthor(Author author) {
        authorRepository.delete(author);
    }

    public Author getAuthor (String name, String surname){
        return authorRepository.findByNameAndSurnameIgnoreCase(name, surname);
    }
}
