package dev.odes.celerity.core.develop.domain.repository;

import dev.odes.celerity.common.repository.AbstractRepository;
import dev.odes.celerity.core.develop.domain.entity.Module;
import dev.odes.celerity.core.develop.domain.entity.View;
import dev.odes.celerity.core.develop.domain.model.ModuleModel;
import dev.odes.celerity.core.develop.domain.model.ViewModel;
import dev.odes.celerity.core.develop.domain.persistence.ModulePersistence;
import dev.odes.celerity.core.develop.domain.persistence.ViewPersistence;
import org.springframework.stereotype.Repository;

@Repository(value = "dev.odes.celerity.core.develop.domain.repository.ViewRepository")
public class ViewRepository extends AbstractRepository<View, ViewModel, ViewPersistence> {
  private final ViewPersistence viewPersistence;
  private final ModulePersistence modulePersistence;

  public ViewRepository(ViewPersistence viewPersistence, ModulePersistence modulePersistence) {
    super(viewPersistence);
    this.viewPersistence = viewPersistence;
    this.modulePersistence = modulePersistence;
  }

  @Override
  public ViewModel transform(View view) {
    ViewModel viewModel = new ViewModel(view);

    Module module = this.modulePersistence.findOneById(view.getModule());
    View parentView = this.viewPersistence.findOneById(view.getParent());
    if (module == null) {
      viewModel.setModule((ModuleModel) null);
    } else {
      viewModel.setModule(new ModuleModel(module));
    }
    if (parentView == null) {
      viewModel.setParent((ViewModel) null);
    } else {
      viewModel.setParent(new ViewModel(parentView));
    }
    return viewModel;
  }

  @Override
  public View transform(ViewModel viewModel) {
    return viewModel.toEntity();
  }
}
