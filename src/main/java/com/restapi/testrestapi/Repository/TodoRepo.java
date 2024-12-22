package com.restapi.testrestapi.Repository;

import com.restapi.testrestapi.Entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {
}
