package com.crud.crudprueba.domain.service;

import com.crud.crudprueba.data.crud.IUserCrudRepository;
import com.crud.crudprueba.data.entity.User;
import com.crud.crudprueba.domain.DTO.response.UserDTO;
import com.crud.crudprueba.domain.service.exception.UserNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserCrudRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDTO create(UserDTO user) {
        User userEntity =  modelMapper.map(user, User.class);
        userEntity = userRepository.save(userEntity);
        return modelMapper.map(userEntity, UserDTO.class);
    }

    @Override
    public UserDTO getUserById(Long id) throws UserNotFoundException {
        UserDTO userDto;
        try{
            Optional<User> userEntity = userRepository.findById(id);
            userDto = modelMapper.map(userEntity, UserDTO.class);
        }catch (EntityNotFoundException e){
            throw new UserNotFoundException(id, e);
        }
        return userDto;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> listUserEntity = userRepository.findAll();
        return listUserEntity.stream().map(user -> modelMapper.map(user, UserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public void deleteUser(Long id) throws UserNotFoundException {
        try{
            userRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new UserNotFoundException(id, e);
        }
    }

    @Override
    public UserDTO updateUser(UserDTO user) {
        return modelMapper.map(userRepository.save(modelMapper.map(user, User.class)), UserDTO.class);
    }
}
