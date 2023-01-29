package com.crud.crudprueba.controller;

import com.crud.crudprueba.service.IAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    public IAccountServiceImpl accountService;


    @GetMapping("/drivers")
    public ResponseEntity<?> findAllDrivers() {
        List<?> driverDTOS = accountService.findAllDrivers();
        try {
            if (driverDTOS == null) {
                throw new RuntimeException("No se encontraron conductores");
            }
        } catch (Exception e) {
              return ResponseEntity.badRequest().body(e.getMessage());

        }
        return ResponseEntity.ok(driverDTOS);
    }

    @GetMapping("/users")
    public ResponseEntity<?> findAllUsers() {
        List<?> usersDTOS = accountService.findAllUsers();
        try {
            if (usersDTOS == null) {
                throw new RuntimeException("No se encontraron usuarios");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());

        }
        return ResponseEntity.ok(usersDTOS);
    }
}
