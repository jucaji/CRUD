package com.crud.crudprueba.response.DTO;

import com.crud.crudprueba.entity.Driver;
import com.crud.crudprueba.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private User user;

    private Driver driver;

}
