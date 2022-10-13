package com.alexandria.alexandria.repositories;

import com.alexandria.alexandria.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findByNameAndSurnameIgnoreCase(String name, String surname);

    Author findByNameAndSurnameAndBirthYear(String name, String surname, int birthYear);
}
