package dev.odes.celerity.persistence.mysql;

import com.github.pagehelper.PageHelper;
import dev.odes.celerity.common.enumeration.PersistenceTypeEnum;
import dev.odes.celerity.common.parameter.Parameter;
import dev.odes.celerity.common.persistence.Persistence;

import java.util.List;

public abstract class AbstractPersistence<T, M extends GenericMapper<T>> implements Persistence<T> {
  private final M mapper;

  public AbstractPersistence(M mapper) {
    this.mapper = mapper;
  }

  @Override
  public PersistenceTypeEnum getPersistenceType() {
    return PersistenceTypeEnum.MYSQL;
  }

  @Override
  public T findOne(Parameter parameter) {
    String where = ParameterAdapter.getWhere(parameter);
    return this.mapper.findOne("");
  }

  @Override
  public List<T> findMany(Parameter parameter) {
    String where = ParameterAdapter.getWhere(parameter);
    String order = ParameterAdapter.getOrder(parameter);
    return this.mapper.findMany("", "");
  }

  @Override
  public List<T> findPage(Parameter parameter) {
    Integer pageNumber = parameter.getPageNumber();
    Integer pageSize = parameter.getPageSize();
    PageHelper.startPage(pageNumber, pageSize);
    return this.mapper.findMany("", "");
  }

  @Override
  public List<T> findAll(Parameter parameter) {
    return this.mapper.findAll("", "");
  }

  @Override
  public T findOneById(String id) {
    String where = "id=" + id;
    // TODO: 查询缓存
    T t = this.mapper.findOne(where);
    return t;
  }

  @Override
  public List<T> findManyById(List<String> ids) {
    String where = "id in (";

    return null;
  }

  @Override
  public void insertOne(T t) {
    this.mapper.insertOne(t);
  }

  @Override
  public void insertMany(List<T> list) {
    this.mapper.insertMany(list);
  }

  @Override
  public void updateOne(T t) {
    this.mapper.updateOne(t);
  }

  @Override
  public void updateMany(List<T> list) {

  }

  @Override
  public void deleteOne(T t) {
    this.mapper.deleteOne(t);
  }

  @Override
  public void deleteMany(List<T> list) {

  }

  @Override
  public void removeOne(T t) {
//    this.mapper.removeOne();
  }

  @Override
  public void removeMany(List<T> list) {

  }

  @Override
  public Integer count() {
    return null;
  }

  @Override
  public Integer exist() {
    return null;
  }

  @Override
  public Integer getIndex() {
    return null;
  }
}
