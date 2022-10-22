package com.alexandria.alexandria.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@Table(name = "Author")
public class Author extends Person{
    @Column(name = "birth_year", nullable = false)
    private int birthYear;
    @Column(name = "death_yaer")
    private int deathYear;

    @OneToMany(mappedBy = "author")
    private Set<AuthorPrinted> authorPrinteds = new HashSet<>();

    public Author() {
        super();
    }

    public Author(String name, String surname, int birthYear, int deathYear) {
        super(name, surname);
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }
}
