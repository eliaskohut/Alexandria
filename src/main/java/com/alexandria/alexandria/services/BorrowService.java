package com.alexandria.alexandria.services;

import com.alexandria.alexandria.entities.Borrow;
import com.alexandria.alexandria.repositories.BorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowService {
    @Autowired
    BorrowRepository borrowRepository;

    public BorrowService() {
    }

    public List<Borrow> getBorrows(){
        return borrowRepository.findAll();
    }

    public void addBorrow(Borrow borrow){
        borrowRepository.save(borrow);
    }

    public void removeBorrow(Borrow borrow) {
        borrowRepository.delete(borrow);
    }
}