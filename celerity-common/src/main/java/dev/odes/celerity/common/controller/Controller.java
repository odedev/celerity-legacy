package dev.odes.celerity.common.controller;

import dev.odes.celerity.common.entity.AbstractEntity;
import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.common.parameter.Parameter;
import dev.odes.celerity.common.response.ResponseData;

import java.util.List;

public interface Controller<E extends AbstractEntity, M extends AbstractModel<E>> {

  /**
   * POST "/find"
   * 获取多行
   * @param parameter
   * @return
   */
  ResponseData findMany(Parameter parameter);

  /**
   * POST "/find/one"
   * 获取单行
   * @param parameter
   * @return
   */
  ResponseData findOne(Parameter parameter);

  /**
   * POST "/find/page"
   * 获取分页多行
   * @param parameter
   * @return
   */
  ResponseData findPage(Parameter parameter);

  /**
   * POST "/find/tree"
   * 获取树形数据
   * @param parameter
   * @return
   */
  ResponseData findTree(Parameter parameter);

  /**
   * POST "/find/all"
   * 获取多行, 包括软删除的数据
   * @param parameter
   * @return
   */
  ResponseData findAll(Parameter parameter);

  /**
   * POST "/find/id"
   * 获取多行, 根据ID
   * @param ids
   * @return
   */
  ResponseData findManyById(List<String> ids);

  /**
   * Get "/{id}"
   * 获取单行, 根据ID
   * @param id
   * @return
   */
  ResponseData findOneById(String id);

  /**
   * POST ""
   * 新增一行
   * @param m
   * @return
   */
  ResponseData insertOne(M m);

  /**
   * POST "/insert"
   * 新增多行
   * @param list
   * @return
   */
  ResponseData insertMany(List<M> list);

  /**
   * PUT ""
   * 更新一行
   * @param m
   * @return
   */
  ResponseData updateOne(M m);

  /**
   * PUT "/update"
   * 更新多行
   * @param list
   * @return
   */
  ResponseData updateMany(List<M> list);

  /**
   * PATCH ""
   * 软删除一行
   * @param m
   * @return
   */
  ResponseData deleteOne(M m);

  /**
   * PATCH "/delete"
   * 软删除多行
   * @param list
   * @return
   */
  ResponseData deleteMany(List<M> list);

  /**
   * DELETE ""
   * 删除一行
   * @param m
   * @return
   */
  ResponseData removeOne(M m);

  /**
   * DELETE "/remove"
   * 删除多行
   * @param list
   * @return
   */
  ResponseData removeMany(List<M> list);

  Integer count(Parameter parameter);
  Boolean exist(Parameter parameter);

}
