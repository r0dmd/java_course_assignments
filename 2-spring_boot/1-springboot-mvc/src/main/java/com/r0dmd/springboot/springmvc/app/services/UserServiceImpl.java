package com.r0dmd.springboot.springmvc.app.services;

import com.r0dmd.springboot.springmvc.app.entities.User;
import com.r0dmd.springboot.springmvc.app.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository repository;

  public UserServiceImpl(UserRepository repository) {
    this.repository = repository;
  }

  @Transactional(readOnly = true)
  @Override
  public List<User> findAll() {
    return (List<User>) this.repository.findAll();
  }

  @Transactional(readOnly = true)
  @Override
  public Optional<User> findById(Long id) {
    return repository.findById(id);
  }

  @Transactional
  @Override
  public User save(User user) {
    return repository.save(user);
  }

  @Override
  @Transactional
  public void remove(Long id) {
    repository.deleteById(id);
  }
}
