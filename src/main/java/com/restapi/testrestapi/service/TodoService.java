package com.restapi.testrestapi.service;


import com.restapi.testrestapi.Entity.TodoEntity;
import com.restapi.testrestapi.Entity.UserEntity;
import com.restapi.testrestapi.Repository.TodoRepo;
import com.restapi.testrestapi.Repository.UserRepo;
import com.restapi.testrestapi.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    TodoRepo todoRepo;
    @Autowired
    UserRepo userRepo;

    public Todo createTodo(TodoEntity todo,  Long userId) {
        UserEntity user = userRepo.findById(userId).get();
        todo.setUser(user);
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo completeTodo(Long id) {
        TodoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return Todo.toModel(todoRepo.save(todo));
    }

}
