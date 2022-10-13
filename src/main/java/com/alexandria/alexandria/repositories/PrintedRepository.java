package com.alexandria.alexandria.repositories;

import com.alexandria.alexandria.entities.Printed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrintedRepository extends JpaRepository<Printed, Long> {
}
