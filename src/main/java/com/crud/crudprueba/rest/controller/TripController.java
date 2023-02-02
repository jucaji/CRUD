package com.crud.crudprueba.rest.controller;

import com.crud.crudprueba.data.entity.Trip;
import com.crud.crudprueba.data.entity.User;
import com.crud.crudprueba.domain.DTO.response.ResultDTO;
import com.crud.crudprueba.domain.DTO.response.TripDTO;
import com.crud.crudprueba.domain.service.ITripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/trips")
public class TripController {

    @Autowired
    private ITripService tripService;


    @PostMapping("/new")
    public ResponseEntity<?> createTrip(@RequestBody TripDTO trip, BindingResult result){
        if(result.hasErrors()){
            return new ResponseEntity<>(new ResultDTO("Error creating trip"), HttpStatus.BAD_REQUEST);
        }
        tripService.create(trip);
        return new ResponseEntity<>(new ResultDTO("Trip created"), HttpStatus.CREATED);
    }

    @GetMapping("/all")
        public List<TripDTO> getAllTrips(){
            return tripService.getAllTrips();
        }


}
