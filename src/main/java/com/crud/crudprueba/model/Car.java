package com.crud.crudprueba.model;

import com.crud.crudprueba.entity.Driver;
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
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "licence")
    private String licence;

    @Column(name = "driver")
    private Driver driver;

    @Column(name = "passengers")
    private String passengers;

    public Car(String licence, Driver driver, String passengers) {
    }
}
