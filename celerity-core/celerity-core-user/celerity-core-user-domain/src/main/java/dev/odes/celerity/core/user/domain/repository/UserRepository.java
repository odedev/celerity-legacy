package dev.odes.celerity.core.user.domain.repository;

import dev.odes.celerity.core.user.domain.persistence.UserPersistence;
import org.springframework.stereotype.Repository;

@Repository(value = "dev.odes.celerity.core.user.domain.repository.UserRepository")
public class UserRepository {
  private final UserPersistence userPersistence;

  public UserRepository(UserPersistence userPersistence) {
    this.userPersistence = userPersistence;
  }
}
