package dev.odes.celerity.core.develop.domain.service;

import dev.odes.celerity.common.service.AbstractService;
import dev.odes.celerity.core.develop.domain.entity.View;
import dev.odes.celerity.core.develop.domain.model.ViewModel;
import dev.odes.celerity.core.develop.domain.repository.ViewRepository;
import org.springframework.stereotype.Service;

@Service
public class ViewService extends AbstractService<View, ViewModel, ViewRepository> {
  private final ViewRepository viewRepository;

  public ViewService(ViewRepository viewRepository) {
    super(viewRepository);
    this.viewRepository = viewRepository;
  }
}
