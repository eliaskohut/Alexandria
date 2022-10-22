package com.alexandria.alexandria.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "printed")
public class Printed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "publish_year", nullable = false)
    private int publishYear;
    @Column(name = "type", nullable = false)
    private String type;
    @Column(name = "topic", nullable = false)
    private String topic;
    @Column(name = "pages", nullable = false)
    private int pages;
    @Column(name = "price", nullable = false)
    private double price;

    public Printed() {
    }

    public Printed(String title, int publishYear, String type, String topic, double price) {
        this.title = title;
        this.publishYear = publishYear;
        this.type = type;
        this.topic = topic;
        this.price = price;
    }

    @OneToMany(mappedBy = "printed", cascade = CascadeType.ALL)
    private Set<AuthorPrinted> authorPrinteds = new HashSet<>();

    @OneToMany(mappedBy = "printed", cascade = CascadeType.ALL)
    private Set<Borrow> borrows = new HashSet<>();
}
