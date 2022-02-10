create table todo (
                      id int8 generated by default as identity,
                      user_id int8,
                      description varchar(255),
                      primary key (id)
);

alter table if exists todo
    add constraint FK_todo_user_id
        foreign key (user_id)
            references users;

insert into todo (user_id, description) VALUES (1, 'create todo app');