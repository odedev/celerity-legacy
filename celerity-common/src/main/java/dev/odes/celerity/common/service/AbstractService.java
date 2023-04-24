package dev.odes.celerity.common.service;

import dev.odes.celerity.common.entity.AbstractEntity;
import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.common.parameter.Parameter;
import dev.odes.celerity.common.repository.Repository;

import java.util.List;

public class AbstractService<E extends AbstractEntity, M extends AbstractModel<E>, R extends Repository<M>> implements Service<E, M> {

  private final R repository;

  public AbstractService(R repository) {
    this.repository = repository;
  }

  @Override
  public M findOne(Parameter parameter) {
    return null;
  }

  @Override
  public List<M> findMany(Parameter parameter) {
    return this.repository.findMany(parameter);
  }

  @Override
  public List<M> findPage(Parameter parameter) {
    return this.repository.findPage(parameter);
  }

  @Override
  public List<M> findAll(Parameter parameter) {
    return this.repository.findAll(parameter);
  }

  @Override
  public M findOneById(String id) {
    return this.repository.findOneById(id);
  }

  @Override
  public List<M> findManyById(List<String> ids) {
    return this.repository.findManyById(ids);
  }

  @Override
  public List<M> findTree(Parameter parameter) {
    return this.repository.findMany(parameter);
  }

  @Override
  public M insertOne(M m) {
    return this.repository.insertOne(m);
  }

  @Override
  public List<M> insertMany(List<M> list) {
    return this.repository.insertMany(list);
  }

  @Override
  public M updateOne(M m) {
    return this.repository.insertOne(m);
  }

  @Override
  public List<M> updateMany(List<M> list) {
    return this.repository.updateMany(list);
  }

  @Override
  public M deleteOne(M m) {
    return this.repository.deleteOne(m);
  }

  @Override
  public List<M> deleteMany(List<M> list) {
    return this.repository.deleteMany(list);
  }

  @Override
  public M removeOne(M m) {
    return this.repository.removeOne(m);
  }

  @Override
  public List<M> removeMany(List<M> list) {
    return this.repository.removeMany(list);
  }

  @Override
  public Integer count() {
    return this.repository.count();
  }

  @Override
  public Boolean exist() {
    return this.repository.exist();
  }
}
