package dev.odes.celerity.common.enumeration;

public enum DataTypeEnum {
  BOOLEAN(0, "BOOLEAN"),
  STRING(1, "String"),
  TEXT(2, "Text"),
  INTEGER(3, "Integer"),
  FLOAT(4, "Float"),
  DATE(5, "Date"),
  ENUM(6, "Enum"),
  ENTITY(7, "Entity"),
  JSON(8, "JSON"),
  FILE(9, "File");

  private final Integer value;
  private final String name;

  DataTypeEnum(Integer value, String name) {
    this.value = value;
    this.name = name;
  }

  public Integer getValue() {
    return value;
  }

  public String getName() {
    return name;
  }
}
