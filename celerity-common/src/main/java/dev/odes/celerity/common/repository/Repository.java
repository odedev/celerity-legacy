package dev.odes.celerity.common.repository;

public interface Repository<M> {
  public M findOne(String where);
  public Iterable<M> findMany(String where, String order);
  public Iterable<M> findPage(String order, Integer pageSize);
  public Iterable<M> findAll(String order);

  public M findOneById(String id);
  public Iterable<M> findManyById(Iterable<String> ids);

  public M insertOne(M m);
  public Iterable<M> insertMany(Iterable<M> list);

  public M updateOne(M m);
  public Iterable<M> updateMany(Iterable<M> list);

  public M deleteOne(M m);
  public Iterable<M> deleteMany(Iterable<M> list);

  public M removeOne(M m);
  public Iterable<M> removeMany(Iterable<M> list);

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
  default void setDefaultValue(Iterable<M> list) {}
  default void validate(M m) {}
  default void validate(Iterable<M> list) {}

  default void beforeInsert(M m) {}
  default void beforeInsert(Iterable<M> list) {}
  default void inserted(M m) {}
  default void inserted(Iterable<M> list) {}
}
