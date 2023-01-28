package com.crud.crudprueba.entity;

import com.crud.crudprueba.model.Payment;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "card")
public class Card extends Payment {

        @Column(name = "number_card")
        private Integer numberCard;

        @Column(name = "cvv")
        private Integer cvv;

        @Column(name = "date")
        private String date;
}
