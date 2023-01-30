package com.crud.crudprueba.data.entity;

import com.crud.crudprueba.domain.models.Car;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UberX extends Car {

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

}


