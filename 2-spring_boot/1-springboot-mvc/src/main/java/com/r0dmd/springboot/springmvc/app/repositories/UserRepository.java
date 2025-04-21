package com.r0dmd.springboot.springmvc.app.repositories;

import com.r0dmd.springboot.springmvc.app.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {}
