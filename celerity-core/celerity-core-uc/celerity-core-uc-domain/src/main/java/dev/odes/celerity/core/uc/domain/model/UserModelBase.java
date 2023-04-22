package dev.odes.celerity.core.uc.domain.model;

import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.core.uc.domain.entity.User;

public class UserModelBase extends AbstractModel<User> {
  private String id;
  private String username;
  private String code;
  private String name;
  private String email;
  private String phone;
  private Integer type;
  private Integer status;
  private Boolean isAdmin;

  public UserModelBase() {}

  public UserModelBase(User user) {
    this.fromEntity(user);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean admin) {
    isAdmin = admin;
  }

  @Override
  public void fromEntity(User user) {
    if (user != null) {
      this.setId(user.getId());
      this.setUsername(user.getUsername());
      this.setCode(user.getCode());
      this.setName(user.getName());
      this.setEmail(user.getEmail());
      this.setPhone(user.getPhone());
      this.setIsAdmin(user.getIsAdmin());
    }
  }

  @Override
  public User toEntity() {
    User user = new User();
    user.setId(this.getId());
    user.setUsername(this.getUsername());
    user.setCode(this.getCode());
    user.setName(this.getName());
    user.setIsAdmin(this.getIsAdmin());
    return user;
  }
}
