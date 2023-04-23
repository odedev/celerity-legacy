package dev.odes.celerity.core.uc.application.controller;

import dev.odes.celerity.common.response.ResponseData;
import dev.odes.celerity.core.uc.application.service.UCApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * package: dev.odes.celerity.core.user.application.controller
 * class: UCApplicationController
 * date: 2023/4/19 20:27
 * version: 1.0.0
 * description:
 */
@RestController
@RequestMapping(path = "/uc")
public class UCApplicationController {
  private final UCApplicationService ucApplicationService;

  public UCApplicationController(UCApplicationService ucApplicationService) {
    this.ucApplicationService = ucApplicationService;
  }

  @GetMapping(path = "/application")
  public ResponseData getUCApplication() {
    return new ResponseData(this.ucApplicationService.getUCApplication());
  }

}
