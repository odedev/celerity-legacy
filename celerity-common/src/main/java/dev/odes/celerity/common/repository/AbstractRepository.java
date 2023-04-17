package dev.odes.celerity.common.repository;

import dev.odes.celerity.common.entity.Entity;
import dev.odes.celerity.common.model.Model;
import dev.odes.celerity.common.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository< E extends Entity, M extends Model<E>,P extends Persistence<E>> implements Repository<M> {
  private final P persistence;

  public AbstractRepository(P persistence) {
    this.persistence = persistence;
  }

//  public abstract Boolean isCache();
//
//  public abstract String getPersistenceType();

  @Override
  public M findOneById(String id) {

    return null;
  }

  @Override
  public M insertOne(M m) {
    m.setDefaultValue();
    m.validate();
    this.beforeInsert(m);
    E e = m.toEntity();
    this.persistence.insertOne(e);
    this.inserted();
    return null;
  }

  @Override
  public void insertMany(Iterable<M> list) {
    list.forEach(m -> {
      m.setDefaultValue();
      m.validate();
    });
    this.setDefaultValue(list);
    this.validate(list);
    this.beforeInsert(list);
    List<E> eList = new ArrayList<>();
    for (M m : list) {
      eList.add(m.toEntity());
    }
    this.persistence.insertMany(eList);
    this.inserted(list);
  }

}
