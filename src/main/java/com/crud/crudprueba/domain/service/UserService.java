package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.crud.IUserCrudRepository;
import com.crud.crudprueba.data.entity.User;
import com.crud.crudprueba.domain.DTO.response.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements GenericService<User> {

    @Autowired(required = true)
    private IUserCrudRepository userRepository;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }
    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public User save(User object) {
        return userRepository.save(object);
    }
    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    public List<UserDTO> asUserDto(){
        List<User> users = (List<User>) userRepository.findAll();
        List<UserDTO> usersDto = new ArrayList<>();
        for (User user : users) {
            UserDTO userDto = new UserDTO();
            userDto.setId(user.getId());
            userDto.setName(user.getName());
            userDto.setDocument(user.getDocument());
            userDto.setEmail(user.getEmail());
        }
        return usersDto;
    }
}
