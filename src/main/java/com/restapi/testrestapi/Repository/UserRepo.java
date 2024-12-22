package com.restapi.testrestapi.Repository;

import com.restapi.testrestapi.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;


public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
