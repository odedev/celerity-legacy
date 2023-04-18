package dev.odes.celerity.core.metadata.domain.repository;

import dev.odes.celerity.core.metadata.domain.entity.View;

import java.util.List;

/**
 * package: dev.odes.celerity.core.metadata.domain.repository
 * class: ViewRepository
 * date: 2023/4/19 0:01
 * version: 1.0.0
 * description:
 */
public interface ViewRepository {
  public View findOne();
  public List<View> findMany();
  public View findOneById(String id);
}
