package com.alexandria.alexandria.services;

import com.alexandria.alexandria.entities.Author;
import com.alexandria.alexandria.entities.AuthorPrinted;
import com.alexandria.alexandria.entities.Printed;
import com.alexandria.alexandria.repositories.AuthorPrintedRepository;
import com.alexandria.alexandria.repositories.PrintedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrintedService {
    @Autowired
    PrintedRepository printedRepository;
    @Autowired
    AuthorPrintedRepository authorPrintedRepository;

    public PrintedService() {
    }

    public List<Printed> getPrinteds(){
        return printedRepository.findAll();
    }

    public Printed getPrinted(Long id){
        return printedRepository.getById(id);
    }
}
