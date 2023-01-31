package com.crud.crudprueba.rest.controller;

import com.crud.crudprueba.data.entity.Trip;
import com.crud.crudprueba.data.entity.User;
import com.crud.crudprueba.domain.DTO.response.ResultDTO;
import com.crud.crudprueba.domain.service.ITripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class TripController {

    @Autowired
    private ITripService tripService;

    @PostMapping("/trips")
    public ResponseEntity<?> newTrip(@RequestBody Trip tripRequest, BindingResult bindingResult) {
        if(bindingResult.hasErrors())
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bindingResult);
        try {
            tripService.save(tripRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ResultDTO("Trip created successfully"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResultDTO("Error creating trip"));
        }
    }
}
