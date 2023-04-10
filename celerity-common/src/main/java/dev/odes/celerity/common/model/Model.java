package dev.odes.celerity.common.model;

public interface Model {
  default void setDefaultValue() {}
  default void setGenericValue() {}
  default void validate() {}
//  default void beforeFind(String where, String order) {}
//  default void found() {}
//  default void beforeInsert() {}
//  default void inserted() {}
//  default void beforeUpdate() {}
//  default void updated() {}
//  default void beforeDelete() {}
//  default void deleted() {}
}
