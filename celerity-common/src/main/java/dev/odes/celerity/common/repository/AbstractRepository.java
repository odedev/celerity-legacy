package dev.odes.celerity.common.repository;

import dev.odes.celerity.common.model.Model;
import dev.odes.celerity.common.persistence.Persistence;

public abstract class AbstractRepository<T extends Model, P extends Persistence<T>> implements Repository<T> {
  private final P persistence;

  public AbstractRepository(P persistence) {
    this.persistence = persistence;
  }

  public abstract Boolean isCache();

  public abstract String getPersistenceType();

  @Override
  public T findOneById(String id) {

    return null;
  }

  @Override
  public T insertOne(T t) {
    t.setDefaultValue();
    t.validate();
    this.beforeInsert();
    this.persistence.insertOne(t);
    this.inserted();
    return null;
  }

  @Override
  public void insertMany(Iterable<T> list) {
    list.forEach(t -> {
      t.setDefaultValue();
      t.validate();
    });
    this.setDefaultValue();
    this.validate(list);
    this.beforeInsert();
    this.persistence.insertMany(list);
    this.inserted(list);
  }

}
