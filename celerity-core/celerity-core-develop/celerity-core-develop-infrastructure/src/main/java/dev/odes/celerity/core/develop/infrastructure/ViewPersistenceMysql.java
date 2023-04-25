package dev.odes.celerity.core.develop.infrastructure;

import dev.odes.celerity.core.develop.domain.entity.View;
import dev.odes.celerity.core.develop.domain.persistence.ViewPersistence;
import dev.odes.celerity.core.develop.infrastructure.mapper.ViewMapper;
import dev.odes.celerity.persistence.mysql.AbstractPersistence;
import org.springframework.stereotype.Repository;

@Repository(value = "dev.odes.celerity.core.develop.infrastructure.ViewPersistenceMysql")
public class ViewPersistenceMysql extends AbstractPersistence<View, ViewMapper> implements ViewPersistence {
  private final ViewMapper viewMapper;

  public ViewPersistenceMysql(ViewMapper viewMapper) {
    super(viewMapper);
    this.viewMapper = viewMapper;
  }
}
