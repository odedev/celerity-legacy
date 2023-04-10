package dev.odes.entity;

import dev.odes.celerity.common.entity.AbstractEntity;
import dev.odes.celerity.common.model.Model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User extends AbstractEntity implements Model {
  protected String id;

  @NotBlank(message = "")
  @NotNull(message = "")
  @Size(max = 64, message = "不能超过64个字符")
  private String username;
  private String password;
  private String email;
  private String phone;

}
