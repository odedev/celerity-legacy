package dev.odes.celerity.common.controller;

import dev.odes.celerity.common.entity.AbstractEntity;
import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.common.parameter.Parameter;
import dev.odes.celerity.common.response.ResponseData;

import java.util.List;

public interface Controller<E extends AbstractEntity, M extends AbstractModel<E>> {

  ResponseData findMany(Parameter parameter);
  ResponseData findOne(Parameter parameter);
  ResponseData findPage(Parameter parameter);
  ResponseData findTree(Parameter parameter);
  ResponseData findAll(Parameter parameter);

  ResponseData findManyById(List<String> ids);
  ResponseData findOneById(String id);

  ResponseData insertOne(M m);
  ResponseData insertMany(List<M> list);

  ResponseData updateOne(String id, M m);
  ResponseData updateMany(List<M> list);

  ResponseData deleteOne(String id, M m);
  ResponseData deleteMany(List<M> list);

  ResponseData removeOne(String id, M m);
  ResponseData removeMany(List<M> list);

  Integer count(Parameter parameter);
  Boolean exist(Parameter parameter);

}
