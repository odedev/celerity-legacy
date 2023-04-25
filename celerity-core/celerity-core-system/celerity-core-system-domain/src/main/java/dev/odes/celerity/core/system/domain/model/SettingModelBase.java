package dev.odes.celerity.core.system.domain.model;

import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.core.system.domain.entity.Setting;

public class SettingModelBase extends AbstractModel<Setting> {
  private String id;

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public void fromEntity(Setting setting) {

  }

  @Override
  public Setting toEntity() {
    return null;
  }
}
