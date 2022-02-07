package com.philstet.springtodo.service;

import com.philstet.springtodo.entity.UserEntity;
import com.philstet.springtodo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<UserEntity> getAllUsers() {
        List<UserEntity> all = (List<UserEntity>) userRepo.findAll();
        return all;
    }
}
