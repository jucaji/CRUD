package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.crud.ITripCrudRepository;
import com.crud.crudprueba.data.entity.Trip;
import com.crud.crudprueba.domain.DTO.response.TripDTO;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class TripServiceImpl implements ITripService {

    @Autowired
    private ITripCrudRepository tripCrudRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public TripDTO create(TripDTO trip) {
        Trip tripEntity =  modelMapper.map(trip, Trip.class);
        tripEntity = tripCrudRepository.save(tripEntity);
        return modelMapper.map(tripEntity, TripDTO.class);
    }

    @Override
    public List<TripDTO> getAllTrips() {
        List<Trip> listTripEntity = tripCrudRepository.findAll();
        return  listTripEntity.stream().map(trip -> modelMapper.map(trip, TripDTO.class)).collect(Collectors.toList());
    }


}
