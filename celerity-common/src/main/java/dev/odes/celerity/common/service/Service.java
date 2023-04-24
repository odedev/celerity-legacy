package dev.odes.celerity.common.service;

import dev.odes.celerity.common.parameter.Parameter;

import java.util.List;

public interface Service<M> {

  M findOne(Parameter parameter);
  List<M> findMany(Parameter parameter);
  List<M> findPage(Parameter parameter);
  List<M> findAll(Parameter parameter);

  List<M> findTree(Parameter parameter);

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
