package dev.odes.celerity.core.develop.application.controller;

import dev.odes.celerity.common.controller.AbstractController;
import dev.odes.celerity.core.develop.domain.entity.Module;
import dev.odes.celerity.core.develop.domain.model.ModuleModel;
import dev.odes.celerity.core.develop.domain.persistence.ModulePersistence;
import dev.odes.celerity.core.develop.domain.repository.ModuleRepository;
import dev.odes.celerity.core.develop.domain.service.ModuleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * package: dev.odes.celerity.core.develop.application.controller
 * class: ModuleController
 * date: 2023/4/24 22:02
 * version: 1.0.0
 * description:
 */
@RestController
@RequestMapping(path = "/develop/module")
public class ModuleController extends AbstractController<Module, ModuleModel, ModulePersistence, ModuleRepository, ModuleService> {
  private final ModuleService moduleService;

  public ModuleController(ModuleService moduleService) {
    super(moduleService);
    this.moduleService = moduleService;
  }
}
