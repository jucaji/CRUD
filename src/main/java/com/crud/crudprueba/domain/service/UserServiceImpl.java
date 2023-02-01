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

/**
 * Service de User para acceder a UserCrudRepository
 * @author Julian Jimenez
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserCrudRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Metodo para crear un usuario
     * @param user
     * @return UserDTO
     */
    @Override
    public UserDTO create(UserDTO user) {
        User userEntity =  modelMapper.map(user, User.class);
        userEntity = userRepository.save(userEntity);
        return modelMapper.map(userEntity, UserDTO.class);
    }

    /**
     * Metodo para obtener un usuario por su id
     * @param id
     * @return UserDTO por id
     * @throws UserNotFoundException si no encuentra el usuario
     */
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

    /**
     * Metodo para obtener todos los usuarios
     * @return List<UserDTO> de todos los usuarios
     */
    @Override
    public List<UserDTO> getAllUsers() {
        List<User> listUserEntity = userRepository.findAll();
        return listUserEntity.stream().map(user -> modelMapper.map(user, UserDTO.class)).collect(Collectors.toList());
    }

    /**
     * Metodo para eliminar un usuario por su id
     * @param id
     * @throws UserNotFoundException si no encuentra el usuario
     */
    @Override
    public void deleteUser(Long id) throws UserNotFoundException {
        try{
            userRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new UserNotFoundException(id, e);
        }
    }

    /**
     * Metodo para actualizar un usuario
     * @param user
     * @return UserDTO actualizado
     */
    @Override
    public UserDTO updateUser(UserDTO user) {
        return modelMapper.map(userRepository.save(modelMapper.map(user, User.class)), UserDTO.class);
    }
    @Override
    public UserDTO findSpecific(String document) {
        UserDTO userDto;
        try{
            User userEntity = (User) userRepository.findUserSpecific(String.valueOf(document));
            userDto = modelMapper.map(userEntity, UserDTO.class);
        }catch (EntityNotFoundException e){
            throw new EntityNotFoundException (document, e);
        }
        return userDto;
    }

}
