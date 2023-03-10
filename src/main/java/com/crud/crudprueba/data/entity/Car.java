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
@Table(name = "car", schema = "crud")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car")
    private Long id;

    @Column(name = "licence")
    private String licence;

    @Column(name = "passengers")
    private Integer passengers;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(getId(), car.getId()) && Objects.equals(getLicence(), car.getLicence()) && Objects.equals(getPassengers(), car.getPassengers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLicence(), getPassengers());
    }
}
