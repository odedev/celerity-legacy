package dev.odes.celerity.core.metadata.domain.service;

import dev.odes.celerity.core.metadata.domain.entity.View;
import dev.odes.celerity.core.metadata.domain.model.ViewModel;
import dev.odes.celerity.core.metadata.domain.repository.ViewRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * package: dev.odes.celerity.core.metadata.domain.service
 * class: ViewService
 * date: 2023/4/19 0:01
 * version: 1.0.0
 * description:
 */
@Service(value = "dev.odes.celerity.core.metadata.domain.service.ViewService")
public class ViewService {
  private final ViewRepository viewRepository;

  public ViewService(ViewRepository viewRepository) {
    this.viewRepository = viewRepository;
  }

  public ViewModel findOne() {
    View view = this.viewRepository.findOne();
    return new ViewModel(view);
  }

  public List<ViewModel> findMany() {
    List<View> views = this.viewRepository.findMany();
    List<ViewModel> viewModels = new ArrayList<>();
    views.forEach(view -> {
      viewModels.add(new ViewModel(view));
    });
    return viewModels;
  }

  public ViewModel findOneById(String id) {
    View view = this.viewRepository.findOneById(null);
    return new ViewModel(view);
  }

}
