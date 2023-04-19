package dev.odes.celerity.common.service;

import dev.odes.celerity.common.entity.AbstractEntity;
import dev.odes.celerity.common.model.AbstractModel;
import dev.odes.celerity.common.repository.Repository;

import java.util.List;

public class AbstractService<E extends AbstractEntity, M extends AbstractModel<E>, R extends Repository<M>> implements Service<M> {

  private final R repository;

  public AbstractService(R repository) {
    this.repository = repository;
  }

  @Override
  public List<M> findPage() {
    return null;
  }
}
