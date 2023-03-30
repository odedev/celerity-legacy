package dev.odes.celerity.common.service;

import dev.odes.celerity.common.repository.Repository;

public class AbstractService<T, R extends Repository<T>> implements Service {

  private final R repository;

  public AbstractService(T t, R repository) {
    this.repository = repository;
  }

}
