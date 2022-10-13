package com.alexandria.alexandria.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@Table(name = "Author")
public class Author extends Person{
    @Column(name = "BirthYear", nullable = false)
    private int birthYear;
    @Column(name = "DeathYear")
    private int deathYear;

    public Author() {
        super();
    }

    public Author(String name, String surname, int birthYear, int deathYear) {
        super(name, surname);
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }
}
