package dev.odes.celerity.common.repository;

import dev.odes.celerity.common.entity.AbstractEntity;
import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.common.persistence.Persistence;


public abstract class AbstractRepository<E extends AbstractEntity, M extends AbstractModel<E>, P extends Persistence<E>> implements Repository<M> {
  private final P persistence;

  public AbstractRepository(P persistence) {
    this.persistence = persistence;
  }

//  public abstract Boolean isCache();
//
//  public abstract String getPersistenceType();

  public abstract M transform(E e);

  public abstract E transform(M m);

  @Override
  public M findOne(String where) {
    E e = this.persistence.findOne();
    M m = this.transform(e);
    return m;
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
