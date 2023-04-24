package dev.odes.celerity.core.develop.domain.repository;

import dev.odes.celerity.common.repository.AbstractRepository;
import dev.odes.celerity.core.develop.domain.entity.Module;
import dev.odes.celerity.core.develop.domain.model.ModuleModel;
import dev.odes.celerity.core.develop.domain.persistence.ModulePersistence;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * package: dev.odes.celerity.core.develop.domain.repository
 * class: ModuleRepository
 * date: 2023/4/23 20:33
 * version: 1.0.0
 * description:
 */
@Repository
public class ModuleRepository extends AbstractRepository<Module, ModuleModel, ModulePersistence> {
  private final ModulePersistence modulePersistence;

  public ModuleRepository(ModulePersistence modulePersistence) {
    super(modulePersistence);
    this.modulePersistence = modulePersistence;
  }

  @Override
  public ModuleModel transform(Module module) {
    return new ModuleModel(module);
  }

  @Override
  public Module transform(ModuleModel moduleModel) {
    return moduleModel.toEntity();
  }

}
