package com.philstet.springtodo.repository;


import com.philstet.springtodo.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
}
