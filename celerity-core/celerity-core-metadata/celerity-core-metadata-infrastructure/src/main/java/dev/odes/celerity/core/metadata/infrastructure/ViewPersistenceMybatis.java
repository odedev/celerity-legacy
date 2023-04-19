package dev.odes.celerity.core.metadata.infrastructure;


import dev.odes.celerity.core.metadata.domain.entity.View;
import dev.odes.celerity.core.metadata.domain.persistence.ViewPersistence;
import dev.odes.celerity.core.metadata.infrastructure.mapper.ViewMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ViewPersistenceMybatis implements ViewPersistence {
  private final ViewMapper viewMapper;

  public ViewPersistenceMybatis(ViewMapper viewMapper) {
    this.viewMapper = viewMapper;
  }

  @Override
  public View findOne() {
    return null;
  }

  @Override
  public List<View> findMany() {
    return null;
  }

  @Override
  public View findOneById(String id) {
    return null;
  }
}

