package dev.odes.celerity.common.model;

public interface Model<E> {
  void fromEntity(E e);
  E toEntity();

  default void setDefaultValue() {}
  default void validate() {}

//  default void setGenericValue() {}

//  default void beforeFind(String where, String order) {}
//  default void found() {}
//  default void beforeInsert() {}
//  default void inserted() {}
//  default void beforeUpdate() {}
//  default void updated() {}
//  default void beforeDelete() {}
//  default void deleted() {}
}
