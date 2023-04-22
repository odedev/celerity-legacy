package dev.odes.celerity.core.uc.domain.persistence;

import dev.odes.celerity.core.uc.domain.entity.User;

import java.util.List;

public interface UserPersistence {
  public User findOne(Object where, Object order);

  public List<User> findMany(Object where, Object order);

  public void insertOne(User user);

  public void updateOne(User user);

  public void deleteOne(User user);

  public void removeOne(String id);

  public List<User> findPage(Integer pageNo, Integer pageSize);

}
