package com.crud.crudprueba.rest.controller;

import com.crud.crudprueba.domain.DTO.response.UserDTO;
import com.crud.crudprueba.domain.service.IUserService;
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

    @GetMapping("/find/{name}")
    public List<UserDTO> findSpecific(@PathVariable("name") String name){
        return userService.findNameLike(name);
    }

     @GetMapping("/findAge18-25")
     public List<UserDTO> findAge18_25(){
        return userService.findUsersAgeInterval();
    }

    @GetMapping("/findNotMarried")
    public List<UserDTO> findNotMarried(){
        return userService.findUsersNotMarried();
    }

    @GetMapping("/findAge/{age}")
    public List<UserDTO> findAge(@PathVariable("age") int age){
        return userService.findUsersAge(age);
    }

    @GetMapping("/findMarriedAndAgeGreater")
    public List<UserDTO> findMarriedAndAgeGreater(){
        return userService.findMarriedAndAgeGreater18();
    }
}
