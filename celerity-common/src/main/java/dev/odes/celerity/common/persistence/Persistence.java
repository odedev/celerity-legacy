package dev.odes.celerity.common.persistence;

import java.util.List;

public interface Persistence<T> {

  /**
   * 查找一条数据, 不包括软删除的数据
   * @return
   */
  public T findOne();

  /**
   * 查找多条数据, 不包括软删除的数据
   * @return
   */
  public List<T> findMany();

  /**
   * 分页查找多条数据, 不包括软删除的数据
   * @param pageNumber 页数
   * @param pageSize   页大小
   * @return
   */
  public Iterable<T> findPage(Integer pageNumber, Integer pageSize);

  /**
   * 查找所有数据, 包括软删除的数据
   * @return
   */
  public List<T> findAll();

  public void insertOne(T t);

  public void insertMany(Iterable<T> list);

  public void updateOne(T t);

  public void updateMany(Iterable<T> list);

  /**
   * 软删除一条数据
   * @param t
   */
  public void deleteOne(T t);

  /**
   * 软删除多条数据
   * @param list
   */
  public void deleteMany(Iterable<T> list);

  /**
   * 硬删除一条数据
   * @param t
   */
  public void removeOne(T t);

  /**
   * 硬删除多条数据
   * @param list
   */
  public void removeMany(Iterable<T> list);

  /**
   * 总数
   * @return
   */
  public Integer count();

  /**
   * 是否存在
   * @return
   */
  public Integer exist();

  /**
   * TODO 确认功能
   * @return
   */
  public Integer getIndex();

}
