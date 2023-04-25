package dev.odes.celerity.core.develop.domain.repository;

import dev.odes.celerity.common.repository.AbstractRepository;
import dev.odes.celerity.core.develop.domain.entity.View;
import dev.odes.celerity.core.develop.domain.model.ModuleModel;
import dev.odes.celerity.core.develop.domain.model.ViewModel;
import dev.odes.celerity.core.develop.domain.persistence.ViewPersistence;
import org.springframework.stereotype.Repository;

@Repository
public class ViewRepository extends AbstractRepository<View, ViewModel, ViewPersistence> {
  private final ViewPersistence viewPersistence;
  private final ModuleRepository moduleRepository;

  public ViewRepository(ViewPersistence viewPersistence, ModuleRepository moduleRepository) {
    super(viewPersistence);
    this.viewPersistence = viewPersistence;
    this.moduleRepository = moduleRepository;
  }

  @Override
  public ViewModel transform(View view) {
    ViewModel viewModel = new ViewModel(view);
    ModuleModel moduleModel = this.moduleRepository.findOneById(view.getModule());
    ViewModel parent = this.findOneById(view.getParent());
    viewModel.setModule(moduleModel);
    viewModel.setParent(parent);
    return viewModel;
  }

  @Override
  public View transform(ViewModel viewModel) {
    return viewModel.toEntity();
  }
}
