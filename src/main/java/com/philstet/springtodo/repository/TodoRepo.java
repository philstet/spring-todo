package com.philstet.springtodo.repository;

import com.philstet.springtodo.entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {
    List<TodoEntity> findAllByUserId(Long userId);
}
