package dev.odes.celerity.core.develop.domain.model;

import dev.odes.celerity.core.develop.domain.entity.Module;

/**
 * package: dev.odes.celerity.core.develop.domain.model
 * class: ModuleModel
 * date: 2023/4/23 20:30
 * version: 1.0.0
 * description:
 */
public class ModuleModel extends ModuleModelBase {

  public ModuleModel() {}

  public ModuleModel(Module module) {
    this.fromEntity(module);
  }

  @Override
  public void setDefaultValue() {
    super.setDefaultValue();
  }

  @Override
  public void validate() {
    super.validate();
  }
}
