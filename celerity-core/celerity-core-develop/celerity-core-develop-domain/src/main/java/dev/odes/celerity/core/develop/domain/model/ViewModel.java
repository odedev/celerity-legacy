package dev.odes.celerity.core.develop.domain.model;

import dev.odes.celerity.core.develop.domain.entity.View;

public class ViewModel extends ViewModelBase {
  public ViewModel() {

  }

  public ViewModel(View view) {
    this.fromEntity(view);
  }

  @Override
  public void setDefaultValue() {
    super.setDefaultValue();
  }

  @Override
  public void validate() {
    super.validate();
  }
}
