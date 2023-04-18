package dev.odes.celerity.core.user.domain.repository.mysql;

import dev.odes.celerity.core.user.domain.entity.User;
import dev.odes.celerity.core.user.domain.model.UserModel;
import dev.odes.celerity.core.user.domain.persistence.UserPersistence;
import dev.odes.celerity.core.user.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryMysql implements UserRepository {
  private final UserPersistence userPersistence;

  public UserRepositoryMysql(UserPersistence userPersistence) {
    this.userPersistence = userPersistence;
  }

  @Override
  public User findOne() {
    return this.userPersistence.findOne(null, null);
  }

  @Override
  public List<User> findMany() {
    return this.userPersistence.findMany(null, null);
  }

  @Override
  public List<UserModel> find() {
    List<User> users = this.userPersistence.findMany(null, null);

    List<UserModel> userModelList = new ArrayList<>();
    users.forEach(user -> {
      UserModel userModel = new UserModel();
      userModel.fromEntity(user);
      userModelList.add(userModel);
    });
    return userModelList;
  }

}
