package dev.odes.celerity.common.repository;

import dev.odes.celerity.common.parameter.Parameter;

import java.util.List;

public interface Repository<M> {
  M findOne(Parameter parameter);
  List<M> findMany(Parameter parameter);
  List<M> findPage(Parameter parameter);
  List<M> findAll(Parameter parameter);

  M findOneById(String id);
  List<M> findManyById(List<String> ids);

  M insertOne(M m);
  List<M> insertMany(List<M> list);

  M updateOne(M m);
  List<M> updateMany(List<M> list);

  M deleteOne(M m);
  List<M> deleteMany(List<M> list);

  M removeOne(M m);
  List<M> removeMany(List<M> list);

  Integer count();
  Boolean exist();
//  public Integer findIndex();

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
  default void beforeRemove() {}
  default void removed() {}

  default void setDefaultValue(M m) {}
  default void setDefaultValue(List<M> list) {}
  default void validate(M m) {}
  default void validate(List<M> list) {}

  default void beforeFind(Parameter parameter) {}
  default void found(M m) {}
  default void found(List<M> list) {}

  default void beforeInsert(M m) {}
  default void beforeInsert(List<M> list) {}
  default void inserted(M m) {}
  default void inserted(List<M> list) {}

  default void beforeUpdate(M m) {}
  default void beforeUpdate(List<M> list) {}
  default void updated(M m) {}
  default void updated(List<M> list) {}

  default void beforeDelete(M m) {}
  default void beforeDelete(List<M> list) {}
  default void deleted(M m) {}
  default void deleted(List<M> list) {}

  default void beforeRemove(M m) {}
  default void beforeRemove(List<M> list) {}
  default void removed(M m) {}
  default void removed(List<M> list) {}
}
