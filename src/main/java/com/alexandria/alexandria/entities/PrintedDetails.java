package com.alexandria.alexandria.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
public class PrintedDetails {
    private Set<Author> authors = new HashSet<>();
    private String title;
    private int publishYear;
    private String type;
    private String topic;
    private double price;

    public PrintedDetails(Set<Author> authors, Printed printed) {
        this.authors = authors;
        this.title=printed.getTitle();
        this.publishYear=printed.getPublishYear();
        this.type= printed.getType();
        this.topic = printed.getTopic();
        this.price = printed.getPrice();
    }
}
