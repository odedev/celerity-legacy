package dev.odes.celerity.common.service;

import dev.odes.celerity.common.entity.AbstractEntity;
import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.common.parameter.Parameter;

import java.util.List;

public interface Service<E extends AbstractEntity, M extends AbstractModel<E>> {

  List<M> findMany(Parameter parameter);
  M findOne(Parameter parameter);
  List<M> findPage(Parameter parameter);
  List<M> findTree(Parameter parameter);
  List<M> findAll(Parameter parameter);

  List<M> findManyById(List<String> ids);
  M findOneById(String id);


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

}
