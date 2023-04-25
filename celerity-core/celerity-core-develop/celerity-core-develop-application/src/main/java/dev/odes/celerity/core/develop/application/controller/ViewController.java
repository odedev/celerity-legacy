package dev.odes.celerity.core.develop.application.controller;

import dev.odes.celerity.common.controller.AbstractController;
import dev.odes.celerity.core.develop.domain.entity.View;
import dev.odes.celerity.core.develop.domain.model.ViewModel;
import dev.odes.celerity.core.develop.domain.persistence.ViewPersistence;
import dev.odes.celerity.core.develop.domain.repository.ViewRepository;
import dev.odes.celerity.core.develop.domain.service.ViewService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "dev.odes.celerity.core.develop.application.controller.ViewController")
@RequestMapping(path = "/develop/view")
public class ViewController extends AbstractController<View, ViewModel, ViewPersistence, ViewRepository, ViewService> {
  private final ViewService viewService;

  public ViewController(ViewService viewService) {
    super(viewService);
    this.viewService = viewService;
  }
}
