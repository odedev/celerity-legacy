package dev.odes.celerity.core.develop.domain.model;

import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.core.develop.domain.entity.View;

public class ViewModelBase extends AbstractModel<View> {
  private String id;
  private String code;
  private String name;
  private String path;
  private Integer serialNo;
  private ViewModel parent;
  private ModuleModel module;
  private Boolean isMenu;

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

  public ViewModel getParent() {
    return parent;
  }

  public void setParent(ViewModel parent) {
    this.parent = parent;
  }

  public ModuleModel getModule() {
    return module;
  }

  public void setModule(ModuleModel module) {
    this.module = module;
  }

  public void setModule(String moduleId) {
    ModuleModel module = new ModuleModel();
    module.setId(moduleId);
    this.module = module;
  }

  public Boolean getIsMenu() {
    return isMenu;
  }

  public void setIsMenu(Boolean menu) {
    isMenu = menu;
  }

  @Override
  public void fromEntity(View view) {
    this.setModule(view.getId());
  }

  @Override
  public View toEntity() {
    View view = new View();
    view.setId(this.getId());
    view.setCode(this.getCode());
    view.setName(this.getName());
    view.setPath(this.getPath());
    view.setSerialNo(this.getSerialNo());
    view.setIsMenu(this.getIsMenu());
    view.setModule(this.getModule().getId());
    return view;
  }
}
