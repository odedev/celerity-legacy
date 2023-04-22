package dev.odes.celerity.core.uc.domain.model;

import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.core.uc.domain.entity.Profile;
import dev.odes.celerity.core.uc.domain.entity.User;

/**
 * package: dev.odes.celerity.core.uc.domain.model
 * class: ProfileModelBase
 * date: 2023/4/22 14:43
 * version: 1.0.0
 * description:
 */
public class ProfileModelBase extends AbstractModel<Profile> {
  private String id;
  private UserModel user;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserModel getUser() {
    return user;
  }

  public void setUser(UserModel user) {
    this.user = user;
  }

  public void setUser(String id) {
    UserModel user = new UserModel();
    user.setId(id);
    this.user = user;
  }

  @Override
  public void fromEntity(Profile profile) {

  }

  @Override
  public Profile toEntity() {
    return null;
  }
}
