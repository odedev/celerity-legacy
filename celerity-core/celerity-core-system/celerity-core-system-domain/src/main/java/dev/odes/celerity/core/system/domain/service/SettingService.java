package dev.odes.celerity.core.system.domain.service;

import dev.odes.celerity.core.system.domain.repository.SettingRepository;
import org.springframework.stereotype.Service;

@Service
public class SettingService {
  public final SettingRepository settingRepository;

  public SettingService(SettingRepository settingRepository) {
    this.settingRepository = settingRepository;
  }
}
