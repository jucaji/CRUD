package com.crud.crudprueba.data.repositoryImplements;

import com.crud.crudprueba.data.crud.*;
import com.crud.crudprueba.domain.repository.ITripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TripRepository implements ITripRepository {

    @Autowired
    IUserCrudRepository userCrudRepository;

    @Autowired
    IRouteCrudRepository routeCrudRepository;

    @Autowired
    ICarCrudRepository carCrudRepository;

    @Autowired
    IPaymentCrudRepository creditCardCrudRepository;


}
