package com.alexandria.alexandria.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "issue_date")
    private LocalDate issueDate;

    @Column(name = "ending_date")
    private LocalDate endingDate;

    public Borrow(LocalDate issueDate, LocalDate endingDate, Printed printed, User user) {
        this.issueDate = issueDate;
        this.endingDate = endingDate;
        this.printed = printed;
        this.user = user;
    }

    public Borrow() {
    }

    @ManyToOne
    @JoinColumn(name = "printed_id")
    private Printed printed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
