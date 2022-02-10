package com.philstet.springtodo.model;

import com.philstet.springtodo.entity.TodoEntity;

public class TodoModel {

    private Long id;
    private String description;

    public static TodoModel toModel(TodoEntity entity) {
        TodoModel model = new TodoModel();
        model.setId(entity.getId());
        model.setDescription(entity.getDescription());
        return model;
    }

    public TodoModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
