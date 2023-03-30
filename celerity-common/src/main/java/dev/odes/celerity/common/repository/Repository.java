package dev.odes.celerity.common.repository;

import java.util.List;

/**
 *
 * @param <T>
 */
public interface Repository<T> {
  public List<T> find(String where, String order);

  public List<T> findAll(String order);

  public T findOneById(String id);

  public T findManyById(List<String> ids);

  public T insertOne(T t);
}
