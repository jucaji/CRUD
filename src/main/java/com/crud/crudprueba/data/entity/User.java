package com.crud.crudprueba.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "user", schema = "crud")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "document")
    private String document;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

}
