package com.philstet.springtodo.service;

import com.philstet.springtodo.entity.TodoEntity;
import com.philstet.springtodo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todoRepo;

    public List<TodoEntity> findTodosByUserId(Long userId) {
        List<TodoEntity> todos = todoRepo.findAllByUserId(userId);
        return todos;
    }
}
