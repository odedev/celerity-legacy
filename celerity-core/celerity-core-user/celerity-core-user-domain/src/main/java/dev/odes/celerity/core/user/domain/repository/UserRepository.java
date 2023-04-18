package dev.odes.celerity.core.user.domain.repository;

import dev.odes.celerity.core.user.domain.entity.User;
import dev.odes.celerity.core.user.domain.model.UserModel;

import java.util.List;

public interface UserRepository {

  public User findOne();

  public List<User> findMany();

  public List<UserModel> find();

}
