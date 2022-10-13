package com.alexandria.alexandria.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "Author_Printed")
public class AuthorPrinted {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "Author_id")
    private Author author;
    @ManyToOne
    @JoinColumn(name = "Printed_id")
    private Printed printed;

    public AuthorPrinted() {
    }

    public AuthorPrinted(Author author, Printed printed) {
        this.author = author;
        this.printed = printed;
    }
}
