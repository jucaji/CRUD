package com.crud.crudprueba.rest.controller;

import com.crud.crudprueba.domain.service.IUserService;
import com.crud.crudprueba.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired()
    public UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> findAllUsers() {
        List<?> usersDTOS = userService.findAllUsers();
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
