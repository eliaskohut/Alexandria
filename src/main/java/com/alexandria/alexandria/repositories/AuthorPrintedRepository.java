package com.alexandria.alexandria.repositories;

import com.alexandria.alexandria.entities.Author;
import com.alexandria.alexandria.entities.AuthorPrinted;
import com.alexandria.alexandria.entities.Printed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorPrintedRepository extends JpaRepository<AuthorPrinted, Long> {

    boolean existsByAuthorAndPrinted(Author author, Printed printed);
}
