package com.crud.crudprueba.data.entity;

import com.crud.crudprueba.data.entity.Car;
import com.crud.crudprueba.data.entity.Route;
import com.crud.crudprueba.data.entity.User;

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
@Table(name = "trip", schema = "crud")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trip")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_route")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "id_car")
    private Car car;

    @Column(name = "ammount")
    private Integer ammount;

    @ManyToOne
    @JoinColumn(name = "id_payment")
    private Payment payment;

    @Column(name = "completed")
    private Boolean completed;

}
