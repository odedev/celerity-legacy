package dev.odes.celerity.core.uc.domain.persistence;

import dev.odes.celerity.core.uc.domain.entity.User;

import java.util.List;

public interface UserPersistence {
  public User findOne(Object where, Object order);

  public List<User> findMany(Object where, Object order);
}
