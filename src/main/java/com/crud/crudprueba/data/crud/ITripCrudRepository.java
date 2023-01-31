package com.crud.crudprueba.data.crud;

import com.crud.crudprueba.data.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITripCrudRepository extends JpaRepository<Trip, Long> {
}
