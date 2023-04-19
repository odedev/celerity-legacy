package dev.odes.celerity.core.uc.application.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * package: dev.odes.celerity.core.user.application.service
 * class: UCApplication
 * date: 2023/4/19 20:30
 * version: 1.0.0
 * description:
 */
@Service
public class UCApplicationService {

  public UCApplicationService() {}

  public Map<String, String> getUCApplication() {
    Map<String, String> map = new HashMap<>();
    map.put("code", "core-uc");
    map.put("name", "用户中心");
    return map;
  }

}
