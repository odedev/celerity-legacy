package dev.odes.celerity.core.system.domain.entity;

import dev.odes.celerity.common.entity.AbstractEntity;

public class Menu extends AbstractEntity {
  private String id;
  private String code;
  private String name;

  /**
   * 是否主菜单, 为 true 则显示在菜单列表
   * default: true
   */
  private Boolean isMasterMenu;

  /**
   * 是否管理员菜单, 为 true 则管理员用户默认显示
   * default: false
   */
  private Boolean isAdminMenu;

}
