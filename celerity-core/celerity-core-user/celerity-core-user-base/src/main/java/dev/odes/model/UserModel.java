package dev.odes.model;

import dev.odes.celerity.common.model.Model;
import dev.odes.celerity.common.utils.IDUtils;
import dev.odes.entity.User;

import java.util.Date;

public class UserModel extends User implements Model {
  @Override
  public String getName() {
    return null;
  }

  @Override
  public void setDefaultValue() {
    if (this.id.isEmpty()) {
      this.id = IDUtils.getUUID();

    }
    this.createdAt = new Date();
  }
}
