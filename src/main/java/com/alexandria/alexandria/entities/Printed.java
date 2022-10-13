package com.alexandria.alexandria.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
public class Printed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
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
}
