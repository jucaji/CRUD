package com.crud.crudprueba.domain.DTO.response;

import com.crud.crudprueba.data.entity.Car;
import com.crud.crudprueba.data.entity.Payment;
import com.crud.crudprueba.data.entity.Route;
import com.crud.crudprueba.data.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripDTO {
    private Integer id;
    private User user;
    private Route route;
    private Car car;
    private Double ammount;
    private Payment payment;
    private Boolean completed;
}
