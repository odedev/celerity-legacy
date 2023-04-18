package dev.odes.celerity.core.user.domain.service;

import dev.odes.celerity.core.user.domain.entity.User;
import dev.odes.celerity.core.user.domain.model.UserModel;
import dev.odes.celerity.core.user.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "dev.odes.celerity.core.user.domain.service.UserService")
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

  public List<UserModel> find() {
    return this.userRepository.find();
  }
}
