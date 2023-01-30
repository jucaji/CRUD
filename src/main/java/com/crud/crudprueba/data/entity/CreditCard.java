package com.crud.crudprueba.data.entity;

import com.crud.crudprueba.domain.models.Payment;
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
@Table(name = "card")
public class CreditCard extends Payment {

        @Column(name = "number_card")
        private Integer numberCard;

        @Column(name = "cvv")
        private Integer cvv;

        @Column(name = "date")
        private String date;
}
