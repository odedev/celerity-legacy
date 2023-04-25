package dev.odes.celerity.common.repository;

import dev.odes.celerity.common.entity.AbstractEntity;
import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.common.model.Model;
import dev.odes.celerity.common.parameter.Parameter;
import dev.odes.celerity.common.persistence.Persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class AbstractRepository<E extends AbstractEntity, M extends AbstractModel<E>, P extends Persistence<E>> implements Repository<M> {
  private final P persistence;

  public AbstractRepository(P persistence) {
    this.persistence = persistence;
  }

  public abstract M transform(E e);

  public abstract E transform(M m);

  @Override
  public M findOne(Parameter parameter) {
    this._beforeFind(parameter);
    E e = this.persistence.findOne(parameter);
    M m = this.transform(e);
    this._found(m);
    return m;
  }

  @Override
  public List<M> findMany(Parameter parameter) {
    this._beforeFind(parameter);
    List<E> list = this.persistence.findMany(parameter);
    List<M> mList = new ArrayList<>();
    list.forEach(e -> mList.add(transform(e)));
    this._found(mList);
    return mList;
  }

  @Override
  public List<M> findPage(Parameter parameter) {
    this._beforeFind(parameter);
    List<E> eList = this.persistence.findPage(parameter);
    List<M> mList = new ArrayList<>();
    eList.forEach(e -> mList.add(transform(e)));
    this._found(mList);
    return mList;
  }

  @Override
  public List<M> findAll(Parameter parameter) {
    this._beforeFind(parameter);
    List<E> eList = this.persistence.findAll(parameter);
    List<M> mList = new ArrayList<>();
    eList.forEach(e -> mList.add(transform(e)));
    this._found(mList);
    return mList;
  }

  @Override
  public M findOneById(String id) {
    this.beforeFind();
    E e = this.persistence.findOneById(id);
    M m = this.transform(e);
    this._found(m);
    return m;
  }

  @Override
  public List<M> findManyById(List<String> ids) {
    this.beforeFind();
    List<E> eList = this.persistence.findManyById(ids);
    List<M> mList = new ArrayList<>();
    eList.forEach(e -> mList.add(transform(e)));
    this._found(mList);
    return mList;
  }

  @Override
  public M insertOne(M m) {
    this._setDefaultValue(m);
    this._validate(m);
    this._beforeInsert(m);
    this.persistence.insertOne(transform(m));
    this._inserted(m);
    return m;
  }

  @Override
  public List<M> insertMany(List<M> list) {
    List<E> eList = new ArrayList<>();
    list.forEach(m -> eList.add(transform(m)));
    this._setDefaultValue(list);
    this._validate(list);
    this._beforeInsert(list);
    this.persistence.insertMany(eList);
    this._inserted(list);
    return null;
  }

  @Override
  public M updateOne(M m) {
    this._setDefaultValue(m);
    this._validate(m);
    this._beforeUpdate(m);
    this.persistence.updateOne(transform(m));
    this._updated(m);
    return m;
  }

  @Override
  public List<M> updateMany(List<M> list) {
    List<E> eList = new ArrayList<>();
    list.forEach(m -> eList.add(transform(m)));
    this._setDefaultValue(list);
    this._validate(list);
    this._beforeUpdate(list);
    this.persistence.updateMany(eList);
    this._updated(list);
    return null;
  }

  @Override
  public M deleteOne(M m) {
    this._beforeDelete(m);
    this.persistence.deleteOne(m.toEntity());
    this._deleted(m);
    return m;
  }

  @Override
  public List<M> deleteMany(List<M> list) {
    List<E> eList = new ArrayList<>();
    list.forEach(m -> eList.add(transform(m)));
    this._beforeDelete(list);
    this.persistence.deleteMany(eList);
    this._deleted(list);
    return null;
  }

  @Override
  public M removeOne(M m) {
    this._beforeRemove(m);
    this.persistence.removeOne(transform(m));
    this._removed(m);
    return m;
  }

  @Override
  public List<M> removeMany(List<M> list) {
    List<E> eList = new ArrayList<>();
    list.forEach(m -> eList.add(transform(m)));
    this._beforeRemove(list);
    this.persistence.removeMany(eList);
    this._removed(list);
    return null;
  }

  @Override
  public Integer count() {
    Integer count = this.persistence.count();
    return count;
  }

  @Override
  public Boolean exist() {
    Integer exist = this.persistence.exist();
    return exist != 0;
  }

  private void _setDefaultValue(M m) {
    m.setDefaultValue();
    this.setDefaultValue();
    this.setDefaultValue(m);
  }

  private void _setDefaultValue(List<M> list) {
    list.forEach(Model::setDefaultValue);
    this.setDefaultValue();
    this.setDefaultValue(list);
  }

  private void _validate(M m) {
    m.validate();
    this.validate();
    this.validate(m);
  }

  private void _validate(List<M> list) {
    list.forEach(Model::validate);
    this.validate();
    this.validate(list);
  }

  private void _beforeFind(Parameter parameter) {
    this.beforeFind();
    this.beforeFind(parameter);
  }

  private void _found(M m) {
    this.found();
    this.found(m);
  }

  private void _found(List<M> list) {
    this.found();
    this.found(list);
  }

  private void _beforeInsert(M m) {
    this.beforeInsert();
    this.beforeInsert(m);
    m.setCreatedAt(new Date());
  }

  private void _beforeInsert(List<M> list) {
    this.beforeInsert();
    this.beforeInsert(list);
    list.forEach(m -> m.setCreatedAt(new Date()));
  }

  private void _inserted(M m) {
    this.inserted();
    this.inserted(m);
  }

  private void _inserted(List<M> list) {
    this.inserted();
    this.inserted(list);
  }

  private void _beforeUpdate(M m) {
    this.beforeUpdate();
    this.beforeUpdate(m);
    m.setUpdatedAt(new Date());
  }

  private void _beforeUpdate(List<M> list) {
    this.beforeUpdate();
    this.beforeUpdate(list);
    list.forEach(m -> m.setUpdatedAt(new Date()));
  }

  private void _updated(M m) {
    this.updated();
    this.updated(m);
  }
  private void _updated(List<M> list) {
    this.updated();
    this.updated(list);
  }

  private void _beforeDelete(M m) {
    this.beforeDelete();
    this.beforeDelete(m);
    m.setDeletedAt(new Date());
  }

  private void _beforeDelete(List<M> list) {
    this.beforeDelete();
    this.beforeDelete(list);
    list.forEach(m -> m.setDeletedAt(new Date()));
  }

  private void _deleted(M m) {
    this.deleted();
    this.deleted(m);
  }

  private void _deleted(List<M> list) {
    this.deleted();
    this.deleted(list);
  }

  private void _beforeRemove(M m) {
    this.beforeRemove();
    this.beforeRemove(m);
  }

  private void _beforeRemove(List<M> list) {
    this.beforeRemove();
    this.beforeRemove(list);
  }

  private void _removed(M m) {
    this.removed();
    this.removed(m);
  }

  private void _removed(List<M> list) {
    this.removed();
    this.removed(list);
  }

}
