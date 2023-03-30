package dev.odes.celerity.common.model;

import dev.odes.celerity.common.entity.Entity;

public interface Model extends Entity {
  default void setDefaultValue() {}
  default void validate() {}
  default void beforeFind(String where, String order) {}
  default void found() {}
  default void beforeInsert() {}
  default void inserted() {}
  default void beforeUpdate() {}
  default void updated() {}
  default void beforeDelete() {}
  default void deleted() {}
}
