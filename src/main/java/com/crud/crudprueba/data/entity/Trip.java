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
@Table(name = "trip")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @Column(name = "ammount")
    private Double ammount;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    @Column(name = "completed")
    private Boolean completed;

}
