package dev.odes.celerity.core.develop.domain.entity;

import dev.odes.celerity.common.entity.AbstractEntity;

public class View extends AbstractEntity {
  private String id;
  private String code;
  private String name;
  private String path;
  private Integer serialNo;
  private String parent;
  private String module;

  /**
   * 是否菜单, 为 true 则显示在菜单列表
   * default: true
   */
  private Boolean isMenu;

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

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Integer getSerialNo() {
    return serialNo;
  }

  public void setSerialNo(Integer serialNo) {
    this.serialNo = serialNo;
  }

  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public String getModule() {
    return module;
  }

  public void setModule(String module) {
    this.module = module;
  }

  public Boolean getIsMenu() {
    return isMenu;
  }

  public void setIsMenu(Boolean menu) {
    isMenu = menu;
  }
}
