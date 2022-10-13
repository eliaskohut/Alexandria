package com.alexandria.alexandria.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@Table(name = "user")
public class User extends Person{
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "role", nullable = false)
    private String role;

    @OneToMany(mappedBy = "user")
    private Set<Borrow> borrows = new HashSet<>();
    public User() {
    }

    public User(String name, String surname, String username, String email, String password, String role) {
        super(name, surname);
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

}
