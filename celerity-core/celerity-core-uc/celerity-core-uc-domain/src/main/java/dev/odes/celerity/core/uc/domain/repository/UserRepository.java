package dev.odes.celerity.core.uc.domain.repository;

import dev.odes.celerity.core.uc.domain.model.UserModel;
import dev.odes.celerity.core.uc.domain.entity.User;
import dev.odes.celerity.core.uc.domain.persistence.UserPersistence;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class UserRepository {
  private final UserPersistence userPersistence;

  public UserRepository(UserPersistence userPersistence) {
    this.userPersistence = userPersistence;
  }

  public User findOne() {
    return this.userPersistence.findOne("", "");
  }

  public List<User> findMany() {
    return this.userPersistence.findMany("", "");
  }

  public List<UserModel> find() {
    List<User> users = this.userPersistence.findMany("", "");

    List<UserModel> userModelList = new ArrayList<>();
    users.forEach(user -> {
      UserModel userModel = new UserModel();
      userModel.fromEntity(user);
      userModelList.add(userModel);
    });
    return userModelList;
  }

  public User insertOne(User user) {
    this.userPersistence.insertOne(user);
    return user;
  }

  public User updateOne(String id, User user) {
    this.userPersistence.updateOne(user);
    return user;
  }

  public void deleteOne(User user) {
    user.setDeletedAt(new Date());
    this.userPersistence.deleteOne(user);
  }

  public void removeOne(String id) {
    this.userPersistence.removeOne(id);
  }
}
