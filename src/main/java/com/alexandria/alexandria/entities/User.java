package com.alexandria.alexandria.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString

@Table(name = "User")
public class User extends Person{
    @Column(name = "Username", nullable = false)
    private String username;
    @Column(name = "Email", nullable = false)
    private String email;
    @Column(name = "Password", nullable = false)
    private String password;
    @Column(name = "Role", nullable = false)
    private String role;

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
