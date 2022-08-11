package com.example.crud_basic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column
    private String username;

    @Column
    private int age;

    @Column
    private String gender;

    public User(int age, String gender, String username) {
        this.age = age;
        this.gender = gender;
        this.username = username;
    }
}
