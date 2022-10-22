package com.alexandria.alexandria.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "author_printed")
public class AuthorPrinted {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    @ManyToOne
    @JoinColumn(name = "printed_id")
    private Printed printed;

    public AuthorPrinted() {
    }

    public AuthorPrinted(Author author, Printed printed) {
        this.author = author;
        this.printed = printed;
    }
}
