package com.alexandria.alexandria.repositories;

import com.alexandria.alexandria.entities.Borrow;
import com.alexandria.alexandria.entities.Printed;
import com.alexandria.alexandria.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRepository extends JpaRepository<Borrow, Long> {
    Borrow findByUserAndPrinted(User user, Printed printed);

    Borrow findByPrinted(Printed printed);
}
