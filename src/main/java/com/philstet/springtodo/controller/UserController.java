package com.philstet.springtodo.controller;

import com.philstet.springtodo.entity.UserEntity;
import com.philstet.springtodo.model.TodoModel;
import com.philstet.springtodo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/all")
    public ResponseEntity showAll(){
        try {
            List<UserEntity> allUsers = userService.getAllUsers();
            return ResponseEntity.ok(allUsers);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/{id}/todos")
    public ResponseEntity getUserTodos(@PathVariable("id") Long userId) {
        try{
            List<TodoModel> userTodos = userService.getUserTodosByUserId(userId);
            return ResponseEntity.ok(userTodos);
        }catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
