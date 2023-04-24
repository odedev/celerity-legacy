package dev.odes.celerity.core.develop.domain.service;

import dev.odes.celerity.common.service.AbstractService;
import dev.odes.celerity.core.develop.domain.entity.Module;
import dev.odes.celerity.core.develop.domain.model.ModuleModel;
import dev.odes.celerity.core.develop.domain.repository.ModuleRepository;
import org.springframework.stereotype.Service;

/**
 * package: dev.odes.celerity.core.develop.domain.service
 * class: ModuleService
 * date: 2023/4/23 20:34
 * version: 1.0.0
 * description:
 */
@Service
public class ModuleService extends AbstractService<Module, ModuleModel, ModuleRepository> {
  private final ModuleRepository moduleRepository;

  public ModuleService(ModuleRepository moduleRepository) {
    super(moduleRepository);
    this.moduleRepository = moduleRepository;
  }
}
