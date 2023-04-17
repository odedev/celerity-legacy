package dev.odes.celerity.common.repository;

import java.util.List;


public interface Repository<T> {
  public T findOne(String condition);
  public List<T> findMany(String where, String order);
  public List<T> findTree(String where, String order);
  public List<T> findAll(String order);

  public T findOneById(String id);
  public T findManyById(Iterable<String> ids);

  public T insertOne(T t);
  public void insertMany(Iterable<T> list);

  default void setDefaultValue() {}
  default void validate() {}
  default void beforeFind() {}
  default void found() {}
  default void beforeInsert() {}
  default void inserted() {}
  default void beforeUpdate() {}
  default void updated() {}
  default void beforeDelete() {}
  default void deleted() {}

  default void setDefaultValue(T t) {}
  default void setDefaultValue(Iterable<T> list) {}
  default void validate(T t) {}
  default void validate(Iterable<T> list) {}

  default void beforeInsert(T t) {}
  default void beforeInsert(Iterable<T> list) {}
  default void inserted(T t) {}
  default void inserted(Iterable<T> list) {}
}
