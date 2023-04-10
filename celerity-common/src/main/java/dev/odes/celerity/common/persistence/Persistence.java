package dev.odes.celerity.common.persistence;

import java.util.List;

public interface Persistence<T> {

  public T findOne();

  public List<T> findMany();

  public void insertOne(T t);

  public void insertMany(Iterable<T> list);

  public void updateOne(T t);

  public void updateMany(Iterable<T> list);

  public void deleteOne(T t);

  public void deleteMany(Iterable<T> list);

  public void removeOne(T t);

  public void removeMany(Iterable<T> list);

  public void count();

  public void exist();

}
