package dev.odes.celerity.core.metadata.domain.persistence;

import dev.odes.celerity.core.metadata.domain.entity.View;

import java.util.List;

public interface ViewPersistence {
  public View findOne();
  public List<View> findMany();
  public View findOneById(String id);
}
