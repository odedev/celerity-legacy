package dev.odes.celerity.core.develop.application.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * package: dev.odes.celerity.core.develop.application.service
 * class: DevelopApplicationService
 * date: 2023/4/23 20:19
 * version: 1.0.0
 * description:
 */
@Service
public class DevelopApplicationService {

  public Map<String, String> getDevelopApplication() {
    Map<String, String> map = new HashMap<>();
    map.put("code", "core-develop");
    map.put("name", "开发工具");
    return map;
  }
}
