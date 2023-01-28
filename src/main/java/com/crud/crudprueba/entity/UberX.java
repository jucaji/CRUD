package com.crud.crudprueba.entity;

import com.crud.crudprueba.model.Car;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class UberX extends Car {

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

}


