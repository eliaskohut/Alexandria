package com.alexandria.alexandria.entities;

import lombok.*;

import javax.persistence.*;
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

    @Column(name = "EndingDate")
    private Date endingDate;

    public Borrow(Date endingDate, Printed printed, User user) {
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
