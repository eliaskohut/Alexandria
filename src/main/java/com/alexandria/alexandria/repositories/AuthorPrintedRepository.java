package com.alexandria.alexandria.repositories;

import com.alexandria.alexandria.entities.Author;
import com.alexandria.alexandria.entities.AuthorPrinted;
import com.alexandria.alexandria.entities.Printed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorPrintedRepository extends JpaRepository<AuthorPrinted, Long> {

    List<Printed> findByAuthor(Author author);
}
