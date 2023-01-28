package com.crud.crudprueba.service;

import com.crud.crudprueba.entity.Driver;
import com.crud.crudprueba.entity.User;
import com.crud.crudprueba.repository.IDriverRepository;
import com.crud.crudprueba.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IDriverRepository driverRepository;

    public Object createAccount(Object account) {
        if (account instanceof Driver) {
            return driverRepository.save((Driver) account);
        } else if (account instanceof User) {
            return userRepository.save((User) account);
        }
        return null;
    }

    public Object updateAccount(Object account) {
        if (account instanceof Driver) {
            return driverRepository.save((Driver) account);
        } else if (account instanceof User) {
            return userRepository.save((User) account);
        }
        return null;
    }

    public Object deleteAccount(Object account) {
        if (account instanceof Driver) {
            driverRepository.delete((Driver) account);
        } else if (account instanceof User) {
            userRepository.delete((User) account);
        }
        return null;
    }

    public Object getAccountById(Object account) {
        if (account instanceof Driver) {
            return driverRepository.findById(((Driver) account).getId());
        } else if (account instanceof User) {
            return userRepository.findById(((User) account).getId());
        }
        return null;
    }

    public Object deleteAccountById(Object account) {
        if (account instanceof Driver) {
            driverRepository.deleteById(((Driver) account).getId());
        } else if (account instanceof User) {
            userRepository.deleteById(((User) account).getId());
        }
        return null;
    }

    public Object getAllAccounts(Object account) {
        if (account instanceof Driver) {
            return driverRepository.findAll();
        } else if (account instanceof User) {
            return userRepository.findAll();
        }
        return null;
    }
}
