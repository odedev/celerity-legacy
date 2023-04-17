package dev.odes.celerity.core.user.base.repository;

import dev.odes.celerity.core.user.base.persistence.UserPersistence;
import dev.odes.celerity.core.user.base.persistence.mapper.UserMapperPersistence;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
  private final UserPersistence userPersistence;

  public UserRepository(UserMapperPersistence userPersistence) {
    this.userPersistence = userPersistence;
  }
}
