package dev.odes.celerity.core.develop.domain.model;

import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.core.develop.domain.entity.Module;

public class ModuleModelBase extends AbstractModel<Module> {
  private String id;
  private String code;
  private String name;
  private String description;
  private Integer moduleType;
  private Integer persistenceType;

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getModuleType() {
    return moduleType;
  }

  public void setModuleType(Integer moduleType) {
    this.moduleType = moduleType;
  }

  public Integer getPersistenceType() {
    return persistenceType;
  }

  public void setPersistenceType(Integer persistenceType) {
    this.persistenceType = persistenceType;
  }

  @Override
  public void fromEntity(Module module) {
    if (module == null) {
      return;
    }
    this.setId(module.getId());
    this.setCode(module.getCode());
    this.setName(module.getName());
    this.setDescription(module.getDescription());
  }

  @Override
  public Module toEntity() {
    Module module = new Module();
    module.setId(this.getId());
    module.setCode(this.getCode());
    module.setName(this.getName());
    module.setDescription(this.getDescription());
    return module;
  }
}
