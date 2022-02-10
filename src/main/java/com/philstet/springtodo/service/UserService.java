package com.philstet.springtodo.service;

import com.philstet.springtodo.entity.TodoEntity;
import com.philstet.springtodo.entity.UserEntity;
import com.philstet.springtodo.exception.UserNotFoundException;
import com.philstet.springtodo.model.TodoModel;
import com.philstet.springtodo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    TodoService todoService;

    public List<UserEntity> getAllUsers() {
        List<UserEntity> all = (List<UserEntity>) userRepo.findAll();
        return all;
    }

    public List<TodoModel> getUserTodosByUserId(Long userId) throws UserNotFoundException {
        Optional<UserEntity> user = userRepo.findById(userId);
        if(user.isEmpty()){
            throw new UserNotFoundException("нет такого пользователя c id " + userId.toString());
        }

        List<TodoEntity> todos = todoService.findTodosByUserId(userId);

        List<TodoModel> todoModels = todos.stream().map(TodoModel::toModel).collect(Collectors.toList());
        return todoModels;
    }
}
