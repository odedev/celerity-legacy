package dev.odes.celerity.core.system.domain.repository;

import dev.odes.celerity.common.repository.AbstractRepository;
import dev.odes.celerity.core.system.domain.entity.Setting;
import dev.odes.celerity.core.system.domain.model.SettingModel;
import dev.odes.celerity.core.system.domain.persistence.SettingPersistence;
import org.springframework.stereotype.Repository;

@Repository
public class SettingRepository extends AbstractRepository<Setting, SettingModel, SettingPersistence> {
  private final SettingPersistence settingPersistence;

  public SettingRepository(SettingPersistence settingPersistence) {
    super(settingPersistence);
    this.settingPersistence = settingPersistence;
  }

  @Override
  public SettingModel transform(Setting setting) {
    SettingModel settingModel = new SettingModel();
    settingModel.fromEntity(setting);
    return settingModel;
  }

  @Override
  public Setting transform(SettingModel settingModel) {
    Setting setting = settingModel.toEntity();
    return setting;
  }

}
