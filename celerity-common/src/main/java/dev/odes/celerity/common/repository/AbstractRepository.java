package dev.odes.celerity.common.repository;

import dev.odes.celerity.common.entity.AbstractEntity;
import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.common.parameter.Parameter;
import dev.odes.celerity.common.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractRepository<E extends AbstractEntity, M extends AbstractModel<E>, P extends Persistence<E>> implements Repository<M> {
  private final P persistence;

  public AbstractRepository(P persistence) {
    this.persistence = persistence;
  }

//  public abstract Boolean isCache();


  public abstract M transform(E e);

  public abstract E transform(M m);

  @Override
  public M findOne(Parameter parameter) {
    E e = this.persistence.findOne(null);
    M m = this.transform(e);
    return m;
  }

  @Override
  public List<M> findMany(Parameter parameter) {
    List<E> list = this.persistence.findMany(parameter);
    List<M> mList = new ArrayList<>();
    list.forEach(e -> mList.add(transform(e)));
    return mList;
  }

  @Override
  public List<M> findPage(Parameter parameter) {
    return null;
  }

  @Override
  public List<M> findAll(Parameter parameter) {
    return null;
  }

  @Override
  public M findOneById(String id) {
    return null;
  }

  @Override
  public List<M> findManyById(List<String> ids) {
    return null;
  }

  @Override
  public M insertOne(M m) {
    return null;
  }

  @Override
  public List<M> insertMany(List<M> list) {
    return null;
  }

  @Override
  public M updateOne(M m) {
    return null;
  }

  @Override
  public List<M> updateMany(List<M> list) {
    return null;
  }

  @Override
  public M deleteOne(M m) {
    return null;
  }

  @Override
  public List<M> deleteMany(List<M> list) {
    return null;
  }

  @Override
  public M removeOne(M m) {
    return null;
  }

  @Override
  public List<M> removeMany(List<M> list) {
    return null;
  }

  @Override
  public Integer count() {
    return null;
  }

  @Override
  public Boolean exist() {
    return null;
  }

  //  @Override
//  public M findOne(String where) {
//    E e = this.persistence.findOne();
//    return null;
//  }
//
//  @Override
//  public M findOneById(String id) {
//
//    return null;
//  }
//
//  @Override
//  public M insertOne(M m) {
//    m.setDefaultValue();
//    m.validate();
//    this.beforeInsert(m);
//    E e = m.toEntity();
//    this.persistence.insertOne(e);
//    this.inserted();
//    return m;
//  }
//
//  @Override
//  public Iterable<M> insertMany(Iterable<M> list) {
//    list.forEach(m -> {
//      m.setDefaultValue();
//      m.validate();
//    });
//    this.setDefaultValue(list);
//    this.validate(list);
//    this.beforeInsert(list);
//    List<E> eList = new ArrayList<>();
//    for (M m : list) {
//      eList.add(m.toEntity());
//    }
//    this.persistence.insertMany(eList);
//    this.inserted(list);
//    return null;
//  }

}
