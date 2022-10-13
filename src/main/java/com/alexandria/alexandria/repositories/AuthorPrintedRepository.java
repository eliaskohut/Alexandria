package com.alexandria.alexandria.repositories;

import com.alexandria.alexandria.entities.AuthorPrinted;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorPrintedRepository extends JpaRepository<AuthorPrinted, Long> {
}
