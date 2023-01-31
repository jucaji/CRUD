package com.crud.crudprueba.rest.controller;

import com.crud.crudprueba.domain.DTO.response.UserDTO;
import com.crud.crudprueba.domain.service.IUserService;
import com.crud.crudprueba.domain.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    public IUserService userService;

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

    @GetMapping("/all")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/new")
    public UserDTO createUser(@RequestBody UserDTO user){
        return userService.create(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

    @PutMapping("/update")
    public UserDTO updateUser(@RequestBody UserDTO user){
        return userService.updateUser(user);
    }

}
