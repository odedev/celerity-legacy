package dev.odes.celerity.core.metadata.domain.model;

import dev.odes.celerity.core.metadata.domain.entity.View;

/**
 * package: dev.odes.celerity.core.metadata.domain.model
 * class: ViewModel
 * date: 2023/4/19 0:00
 * version: 1.0.0
 * description:
 */
public class ViewModel {
  private String id;
  private String code;
  private String name;
  private String path;

  public ViewModel() {}

  public ViewModel(View view) {
    this.fromEntity(view);
  }

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

  public void fromEntity(View view) {
    this.setId(view.getId());
    this.setCode(view.getCode());
    this.setName(view.getName());
    this.setPath(view.getPath());
  }

  public View toEntity() {
    View view = new View();
    view.setId(this.getId());
    view.setCode(this.getCode());
    view.setName(this.getName());
    view.setPath(this.getPath());
    return view;
  }
}
