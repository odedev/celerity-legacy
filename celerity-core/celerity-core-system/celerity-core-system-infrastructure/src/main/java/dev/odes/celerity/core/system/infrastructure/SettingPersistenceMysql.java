package dev.odes.celerity.core.system.infrastructure;

import dev.odes.celerity.core.system.domain.entity.Setting;
import dev.odes.celerity.core.system.domain.persistence.SettingPersistence;
import dev.odes.celerity.core.system.infrastructure.mapper.SettingMapper;
import dev.odes.celerity.persistence.mysql.AbstractPersistence;
import org.springframework.stereotype.Repository;

@Repository
public class SettingPersistenceMysql extends AbstractPersistence<Setting, SettingMapper> implements SettingPersistence {
  private final SettingMapper settingMapper;

  public SettingPersistenceMysql(SettingMapper settingMapper) {
    super(settingMapper);
    this.settingMapper = settingMapper;
  }
}
