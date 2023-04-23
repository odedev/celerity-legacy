package dev.odes.celerity.core.metadata.domain.entity;

/**
 * package: dev.odes.celerity.core.metadata.domain.entity
 * class: View
 * date: 2023/4/18 23:58
 * version: 1.0.0
 * description:
 */
public class View {
  private String id;
  private String code;
  private String name;
  private String path;

  /**
   * 是否主菜单, 为 true 则显示在菜单列表
   * default: true
   */
  private Boolean isMasterMenu;

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
}
