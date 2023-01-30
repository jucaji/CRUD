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
@Table(name = "route", schema = "crud")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_route")
    private Integer id;

    @Column(name = "startPoint")
    private Integer start ;

    @Column(name = "endPoint")
    private Integer end;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Route route)) return false;
        return getId().equals(route.getId()) && getStart().equals(route.getStart()) && getEnd().equals(route.getEnd());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStart(), getEnd());
    }
}
