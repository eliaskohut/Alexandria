package com.alexandria.alexandria.services;

import com.alexandria.alexandria.entities.Author;
import com.alexandria.alexandria.entities.AuthorPrinted;
import com.alexandria.alexandria.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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
        try{
            Optional<Author> result = authorRepository.findById(author.getId());
        }catch (InvalidDataAccessApiUsageException e) {
            if(authorUnique(author)){
                authorRepository.save(author);
            }
        }

    }

    public void removeAuthor(Author author) {
        try{
            Optional<Author> result = authorRepository.findById(author.getId());
            authorRepository.delete(author);
        }catch (InvalidDataAccessApiUsageException e) {
            return;
        }
    }

    public Author getAuthor (String name, String surname){
        try {
            return authorRepository.findByNameAndSurnameIgnoreCase(name, surname);
        }catch (Exception e) {
            return null;
        }
    }

    public boolean authorUnique(Author author){
        Optional<Author> authorDetails = Optional.ofNullable(getAuthor(author.getName(), author.getSurname()));
        if(authorDetails.isPresent() && author.getBirthYear() == authorDetails.get().getBirthYear() && author.getDeathYear()
        == authorDetails.get().getDeathYear()){
            return false;
        }else{
            return true;
        }
    }

}
