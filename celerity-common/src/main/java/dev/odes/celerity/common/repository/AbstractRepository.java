package dev.odes.celerity.common.repository;

import dev.odes.celerity.common.model.Model;
import dev.odes.celerity.common.persistence.Persistence;

public abstract class AbstractRepository<T, M extends Model, P extends Persistence<M>> implements Repository<T> {

  private final M model;
  private final P persistence;

  public AbstractRepository(M model, P persistence) {
    this.model = model;
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
    this.model.setDefaultValue();
    this.model.beforeInsert();
    this.persistence.insertOne(this.model);
    this.model.inserted();
    return null;
  }
}
