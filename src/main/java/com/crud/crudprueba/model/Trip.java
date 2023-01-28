package com.crud.crudprueba.model;

import com.crud.crudprueba.entity.Route;
import com.crud.crudprueba.entity.User;
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
@Table(name = "trip")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user")
    private User user;

    @Column(name = "route")
    private Route route;

    @Column(name = "car")
    private Car car;

    @Column(name = "ammount")
    private Double ammount;

    private Payment payment;

    @Column(name = "completed")
    private Boolean completed;

}
