package dev.odes.celerity.core.develop.domain.entity;

import dev.odes.celerity.common.entity.AbstractEntity;

public class Module extends AbstractEntity {
  private String id;
  private String code;
  private String name;
  private String description;
//  private String namespace;
//  private String directory;
  private Integer moduleType;
  private Integer persistenceType;

  public String getId() {
    return id;
  }

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
}
