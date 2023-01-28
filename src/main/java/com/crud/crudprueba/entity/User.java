package com.crud.crudprueba.entity;

import com.crud.crudprueba.model.Account;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User extends Account{


}
