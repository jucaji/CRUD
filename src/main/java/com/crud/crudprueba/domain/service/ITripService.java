package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.entity.Trip;
import com.crud.crudprueba.domain.DTO.response.TripDTO;

import java.util.List;

public interface ITripService {

    public TripDTO create(TripDTO trip);

    public List<TripDTO> getAllTrips();

}
