package dev.odes.celerity.core.develop.infrastructure;

import dev.odes.celerity.core.develop.domain.entity.Module;
import dev.odes.celerity.core.develop.domain.persistence.ModulePersistence;
import dev.odes.celerity.core.develop.infrastructure.mapper.ModuleMapper;
import dev.odes.celerity.persistence.mysql.AbstractPersistence;
import org.springframework.stereotype.Repository;

/**
 * package: dev.odes.celerity.core.develop.infrastructure
 * class: UserPersistenceMysql
 * date: 2023/4/24 21:58
 * version: 1.0.0
 * description:
 */
@Repository
public class ModulePersistenceMysql extends AbstractPersistence<Module, ModuleMapper> implements ModulePersistence {
  private final ModuleMapper moduleMapper;

  public ModulePersistenceMysql(ModuleMapper moduleMapper) {
    super(moduleMapper);
    this.moduleMapper = moduleMapper;
  }
}
