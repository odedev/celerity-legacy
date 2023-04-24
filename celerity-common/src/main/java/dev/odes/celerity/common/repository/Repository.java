package dev.odes.celerity.common.repository;

import dev.odes.celerity.common.parameter.Parameter;

import java.util.List;

public interface Repository<M> {
  public M findOne(Parameter parameter);
  public List<M> findMany(Parameter parameter);
  public List<M> findPage(Parameter parameter);
  List<M> findAll(Parameter parameter);

  public M findOneById(String id);
  public List<M> findManyById(List<String> ids);

  public M insertOne(M m);
  public List<M> insertMany(List<M> list);

  public M updateOne(M m);
  public List<M> updateMany(List<M> list);

  public M deleteOne(M m);
  public List<M> deleteMany(List<M> list);

  public M removeOne(M m);
  public List<M> removeMany(List<M> list);

  public Integer count();
  public Boolean exist();
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

  default void beforeInsert(M m) {}
  default void beforeInsert(List<M> list) {}
  default void inserted(M m) {}
  default void inserted(List<M> list) {}
}
