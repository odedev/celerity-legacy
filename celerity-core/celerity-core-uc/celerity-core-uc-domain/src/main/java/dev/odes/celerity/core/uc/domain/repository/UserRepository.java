package dev.odes.celerity.core.uc.domain.repository;

import dev.odes.celerity.core.uc.domain.model.UserModel;
import dev.odes.celerity.core.uc.domain.entity.User;
import dev.odes.celerity.core.uc.domain.persistence.UserPersistence;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
  private final UserPersistence userPersistence;

  public UserRepository(UserPersistence userPersistence) {
    this.userPersistence = userPersistence;
  }

  public User findOne() {
    return this.userPersistence.findOne(null, null);
  }

  public List<User> findMany() {
    return this.userPersistence.findMany(null, null);
  }

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
