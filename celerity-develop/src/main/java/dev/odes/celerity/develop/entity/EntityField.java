package dev.odes.celerity.develop.entity;

import dev.odes.celerity.develop.enumeration.DataTypeEnum;
import jakarta.validation.constraints.NotBlank;

public class EntityField {

  /**
   * 主键ID
   * type: uuid
   */
  @NotBlank
  private String id;

  /**
   * 实体ID
   */
  @NotBlank
  private String entity;

  /**
   * 编码
   */
  @NotBlank
  private String code;

  /**
   * 名称
   */
  @NotBlank
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

  private Boolean isHidden;

  private Boolean isDefaultDisplay;
  private DataTypeEnum dataType;
  private Integer maxLength;
  private String defaultValue;
  private String referenceEnum;
  private String referenceEntity;
  private String referenceEntityField;
  private Integer segmentCount;

}
