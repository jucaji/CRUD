package com.crud.crudprueba.data.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "payment", schema = "crud")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payment")
    private Integer id;

    @Column(name = "number_card")
    private Integer numberCard;

    @Column(name = "cvv")
    private Integer cvv;

    @Column(name = "date")
    private String date;

}
