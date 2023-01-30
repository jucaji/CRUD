package com.crud.crudprueba.rest.controller;

import com.crud.crudprueba.domain.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired(required = true)
    public IUserService IUserService;

    @GetMapping("/users")
    public ResponseEntity<?> findAllUsers() {
        List<?> usersDTOS = IUserService.findAllUsers();
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
