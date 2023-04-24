package dev.odes.celerity.common.service;

import dev.odes.celerity.common.parameter.Parameter;

import java.util.List;

public interface Service<M> {

  public M findOne(Parameter parameter);
  public List<M> findMany(Parameter parameter);
  public List<M> findPage(Parameter parameter);
  List<M> findAll(Parameter parameter);
  List<M> findPage();

  List<M> findTree(Parameter parameter);

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

}
