package dev.odes.celerity.core.uc.domain.service;

import dev.odes.celerity.core.uc.domain.entity.User;
import dev.odes.celerity.core.uc.domain.model.UserModel;
import dev.odes.celerity.core.uc.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public UserModel findOneById() {

    return null;
  }

  public List<User> findMany() {
    return this.userRepository.findMany();
  }

  public User findOne() {
    return this.userRepository.findOne();
  }

  public List<UserModel> findAll() {
    return this.userRepository.findAll();
  }


  public List<UserModel> find() {
    return this.userRepository.findAll();
  }

  public User insertOne(User user) {
    return this.userRepository.insertOne(user);
  }

  public User updateOne(String id, User user) {
    return this.userRepository.updateOne(id, user);
  }

  public void deleteOne(User user) {
    this.userRepository.deleteOne(user);
  }

  public void removeOne(String id) {
    this.userRepository.removeOne(id);
  }

}
