package dev.odes.celerity.common.field;

import dev.odes.celerity.common.enumeration.DataTypeEnum;

public class Field {

  /**
   * 编码
   */
  private String code;

  /**
   * 名称
   */
  private String name;

  /**
   * 描述
   */
  private String description;

  /**
   * 是否可空
   * default: true
   */
  private Boolean isNullable;

  /**
   * 是否可编辑
   * default: true
   */
  private Boolean isEditable;

  /**
   * 是否可搜索
   * default: true
   */
  private Boolean isSearchable;

  /**
   * 是否隐藏
   * default: false
   */
  private Boolean isHidden;

  /**
   * 是否默认显示, 只能有一个字段为 true
   * default: false
   */
  private Boolean isDefaultDisplay;

  /**
   * 是否主键, 只能有一个字段为 true
   * default: false
   */
  private Boolean isPrimaryKey;

  /**
   * 是否父字段, 只能有一个字段为 true
   * default: false
   */
  private Boolean isParentField;

  /**
   * 是否主实体字段, 只能有一个字段为 true, 主从关系使用
   * default: false
   */
  private Boolean isMasterField;

  /**
   * 是否从实体字段, 主从关系使用
   * default: false
   */
  private Boolean isSlaveField;

  /**
   * 数据类型
   */
  private DataTypeEnum dataType;

  /**
   * 长度
   * default: 255
   */
  private Integer length;

  /**
   * 默认值
   */
  private String defaultValue;

  /**
   * 初始化值
   */
  private String initialValue;

  /**
   * 引用枚举
   */
  private String referenceEnum;

  /**
   * 引用实体
   */
  private String referenceEntity;

  /**
   * 引用实体字段
   */
  private String referenceEntityField;

  public Field() {
  }
}
