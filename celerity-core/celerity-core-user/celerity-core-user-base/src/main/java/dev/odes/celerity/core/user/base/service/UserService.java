package dev.odes.celerity.core.user.base.service;

import dev.odes.celerity.core.user.base.model.UserModel;
import dev.odes.celerity.core.user.base.persistence.UserPersistence;
import dev.odes.celerity.core.user.base.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public UserModel findOneById() {

    return null;
  }
}
