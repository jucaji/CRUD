package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.crud.ITripCrudRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TripServiceImpl implements ITripService {

    @Autowired
    private ITripCrudRepository tripCrudRepository;


}
