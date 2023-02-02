package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.domain.DTO.response.UserDTO;


import java.util.List;

public interface IUserService {

    public UserDTO create(UserDTO user);

    public UserDTO getUserById(Long id);

    public List<UserDTO> getAllUsers();

    public void deleteUser(Long id);

    public UserDTO updateUser(UserDTO user);

    public  List<UserDTO> findNameLike(String document);

    public List<UserDTO> findUsersAgeInterval();

    public List<UserDTO> findUsersNotMarried();

    public List<UserDTO> findUsersAge(int age);

    public List<UserDTO> findMarriedAndAgeGreater18();
}
