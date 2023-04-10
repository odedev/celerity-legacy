package dev.odes.celerity.develop.entity;

import dev.odes.celerity.common.enumeration.DataTypeEnum;
import dev.odes.celerity.common.field.Field;

public class EntityField extends Field {

  /**
   * 主键ID
   * type: uuid
   */
  private String id;

  /**
   * 实体ID
   */
  private String entity;

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
   * default: false
   */
  private Boolean isSearchable;

  /**
   * 是否隐藏
   * default: false
   */
  private Boolean isHidden;

  /**
   * 是否默认显示
   * default: true
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


}
