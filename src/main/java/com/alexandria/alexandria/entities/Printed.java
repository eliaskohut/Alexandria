package com.alexandria.alexandria.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@Table(name = "Printed")
public class Printed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Printed_id", nullable = false)
    private Long id;
    @Column(name = "Title", nullable = false)
    private String title;
    @Column(name = "PublishYear", nullable = false)
    private int publishYear;
    @Column(name = "Type", nullable = false)
    private String type;
    @Column(name = "Topic", nullable = false)
    private String topic;
    @Column(name = "Price", nullable = false)
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
}
