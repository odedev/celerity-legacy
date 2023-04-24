package dev.odes.celerity.common.persistence;

import dev.odes.celerity.common.enumeration.PersistenceTypeEnum;
import dev.odes.celerity.common.parameter.Parameter;

import java.util.List;

public interface Persistence<T> {

  /**
   * 获取持久化类型
   * @return
   */
  PersistenceTypeEnum getPersistenceType();

  /**
   * 查找一条数据, 不包括软删除的数据
   * @return
   */
  T findOne(Parameter parameter);

  /**
   * 查找多条数据, 不包括软删除的数据
   * @return
   */
  List<T> findMany(Parameter parameter);

  /**
   * 分页查找多条数据, 不包括软删除的数据
   * @return
   */
  List<T> findPage(Parameter parameter);

  /**
   * 查找所有数据, 包括软删除的数据
   * @return
   */
  List<T> findAll(Parameter parameter);

  T findOneById(String id);

  List<T> findManyById(List<String> ids);

  void insertOne(T t);

  void insertMany(List<T> list);

  void updateOne(T t);

  void updateMany(List<T> list);

  /**
   * 软删除一条数据
   * @param t
   */
  void deleteOne(T t);

  /**
   * 软删除多条数据
   * @param list
   */
  void deleteMany(List<T> list);

  /**
   * 硬删除一条数据
   * @param t
   */
  void removeOne(T t);

  /**
   * 硬删除多条数据
   * @param list
   */
  void removeMany(List<T> list);

  /**
   * 总数
   * @return
   */
  Integer count();

  /**
   * 是否存在
   * @return
   */
  Integer exist();

  /**
   * TODO 确认功能
   * @return
   */
  Integer getIndex();

}
