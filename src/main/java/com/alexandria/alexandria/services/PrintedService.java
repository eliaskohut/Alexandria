package com.alexandria.alexandria.services;

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

    public PrintedService() {
    }

    public List<Printed> getPrinted(){
        return printedRepository.findAll();
    }

    public void addPrinted(Printed printed){
        printedRepository.save(printed);
    }

    public void removePrinted(Printed printed) {
        printedRepository.delete(printed);
    }
}
